// Installing "entr" from pacman for file changes updates.
module.exports = class UltimateTicTacToeGame {
  constructor() {
    this.smallGameBoards = [];
    this.mainGameBoard = [
      null, null, null,
      null, null, null,
      null, null, null,
    ];
    const BOARD_SIZE = 9;
    const SUB_BOARD_SIZE = 3; // MINI-BOARD_SIZE
    for (let i = 0; i < BOARD_SIZE; i += 1) {
      this.smallGameBoards.push([
        null, null, null,
        null, null, null,
        null, null, null,
      ]); // Pushing 9 boards
    }

    this.currentPlayer = 'X';
    this.winner = undefined;
    this.currentMove = [null, null];
    this.totalMoves = 0;
    this.moveLog = {};

    // These are algorithm specific data, which will be used by
    // the bot to navigate best moves possible, using minimax
    // Here are some weights and some experimental arrays designed
    // that prioritizes certain blocks or cells.

    // Additive weights
    this.xPlayerWeightsSmall = [];
    this.oPlayerWeightsSmall = [];
    for (let i = 0; i < 9; i += 1) {
      // Original
      this.xPlayerWeightsSmall.push([0.3, 0.1, 0.3, 0.1, 0.5, 0.1, 0.3, 0.1, 0.3]);

      // Inverted
      this.oPlayerWeightsSmall.push([-0.3, -0.1, -0.3, -0.1, -0.5, -0.1, -0.3, -0.1, -0.3]);
    }

    // Multiplicative weights
    // Original
    this.xPlayerWeightsLarge = [3, 1, 3, 1, 5, 1, 3, 1, 3];

    // Inverted
    this.oPlayerWeightsLarge = this.xPlayerWeightsLarge.map((weight) => weight * -1);

    // Weight dynamics
    // Original
    this.additiveWeightsToCell = [
      [0.1, 0.2, 0.2, 0.2, 0.2, 0, 0.2, 0, 0.2],
      [0.2, 0.1, 0.2, 0, 0.2, 0, 0, 0.2, 0],
      [0.2, 0.2, 0.1, 0, 0.2, 0.2, 0.2, 0, 0.2],
      [0.2, 0, 0, 0.1, 0.2, 0.2, 0.2, 0, 0],
      [0.2, 0.2, 0.2, 0.2, 0.1, 0.2, 0.2, 0.2, 0.2],
      [0, 0, 0.2, 0.2, 0.2, 0.1, 0, 0.2, 0.2],
      [0.2, 0, 0.2, 0.2, 0.2, 0, 0.1, 0.2, 0.2],
      [0, 0.2, 0, 0, 0.2, 0, 0.2, 0.1, 0.2],
      [0.2, 0, 0.2, 0, 0.2, 0.2, 0.2, 0.2, 0.1],
    ];

    // Inverted
    this.substractiveWeightsToCell = this.additiveWeightsToCell.map((array) => {
      const invert = array.map((weight) => weight * -1);
      return invert;
    });
  }

  // Setup the game logic for two players, then give controlled
  // access to bot algorithm to these methods and properties of the
  // game.

  // ?? Captures current game state in case something goes wrong.

  // Currently Checks currentMove validity, check wins and ties, updates
  // weights, switches current player, throws only false on failures.
  makeMove(x, y, debug) {
    // Method side validation
    if (x >= BOARD_SIZE || y >= BOARD_SIZE) {
      console.log('Out of bound, currentMove should not exceeed board limit');
      return false;
    }

    // Checks if the next currentMove is valid in two ways:

    // Checks if the current board is full or not, if so then skip this
    // condition and let the player play in any of board

    // Else check if the currentMove played is played in the current board or not,
    // also check whether the currentMove is first currentMove of the game, if so skip
    // condition and let the player play in any of board.

    if (this.mainGameBoard[this.currentMove[1]] === null) {
      if (this.totalMoves && this.currentMove[1] !== x) {
        console.log(`Invalid currentMove, the cell should be in ${this.currentMove[1] + 1}`);
        return false;
      }
    }

    if (this.smallGameBoards[x][y] || this.mainGameBoard[x] || this.winner) {
      if (debug) {
        console.log(`sb:${this.smallGameBoards[x][y]} lb:${this.mainGameBoard[x]} win:${this.winner}`);
      } else {
        console.log('Invalid currentMove, either the cell || the small board is full || won');
      }
      return false;
    }

    // UGS
    this.smallGameBoards[x][y] = this.currentPlayer;
    this.currentMove = [x, y];
    this.totalMoves += 1;

    // UGS

    // Checks wins and ties at small board
    console.log('checking small tie or win');
    const smallCheck = this.checkWinCondition(this.currentPlayer, this.smallGameBoards[x], y) ? 'Won' : this.checkTieCondition(this.smallGameBoards[x]) ? 'Tie' : 'Nothing';
    if (smallCheck === 'Won') {
      this.mainGameBoard[x] = this.currentPlayer;
      console.log('updating weights');
      this.updatePlayerWeights(this.currentPlayer, [x, y]);
    } else if (smallCheck === 'Tie') {
      this.mainGameBoard[x] = 'T';
      console.log('updating weights');
      this.updatePlayerWeights(this.currentPlayer, [x, y]);
    }

    // Checks wins and ties at large board and swtiches current player
    console.log('checking big tie or win');
    const largeCheck = this.checkWinCondition(this.currentPlayer, this.mainGameBoard, y) ? 'Won' : this.checkTieCondition(this.mainGameBoard) ? 'Tie' : 'Nothing';
    if ((largeCheck === 'Won')) {
      this.winner = this.currentPlayer;
    } else if (largeCheck === 'Tie') {
      this.winner = 'T';
    }

    // DEV: Experimental
    if (smallCheck === 'Nothing' && largeCheck === 'Nothing') {
      this.updatePlayerWeights(this.currentPlayer, [x, y]);
      this.moveLog[this.totalMoves] = [this.currentPlayer, x, y];
    } else {
      this.moveLog[this.totalMoves] = [this.currentPlayer, x, y, smallCheck, largeCheck];
    }
    this.currentPlayer = this.currentPlayer === 'X' ? 'O' : 'X';
    return true;
  }

  checkWinCondition(player, board, currentMove) {
    const y = currentMove;
    if (y === undefined || y === null) {
      console.log('currentMove is invalid, check before using checkWinCondition');
      process.exit(1);
    }
    const row = board.slice(y - (y % SUB_BOARD_SIZE), y - (y % SUB_BOARD_SIZE) + SUB_BOARD_SIZE);
    const col = [board[y % BOARD_SIZE], board[(y + SUB_BOARD_SIZE) % BOARD_SIZE], board[(y + 6) % BOARD_SIZE]];
    const diag1 = [board[0], board[4], board[8]];
    const diag2 = [board[2], board[4], board[6]];
    if (row.every((cell) => cell === player)
      || col.every((cell) => cell === player)
      || diag1.every((cell) => cell === player)
      || diag2.every((cell) => cell === player)) {
      return true;
    }
    return false;
  }

  checkTieCondition(board) {
    return board.every((cell) => cell);
  }

  updatePlayerWeights(player, currentMove) {
    const [x, y] = currentMove;

    if (player === 'X') {
      if (this.mainGameBoard[x] === 'X') {
        if (this.winner === 'X') {
          this.xPlayerWeightsLarge[x] += 1000;
        } else {
          this.xPlayerWeightsLarge[x] += 100;
        }
      } else if (this.mainGameBoard[x] === 'T') {
        this.xPlayerWeightsLarge[x] = 0;
        this.oPlayerWeightsLarge[x] = 0;
      }
      for (let i = 0; i < BOARD_SIZE; i += 1) {
        if (this.xPlayerWeightsSmall[x][i] !== 0) {
          this.xPlayerWeightsSmall[x][i] += this.additiveWeightsToCell[y][i];
        }
      }
      this.oPlayerWeightsSmall[x][y] = 0;
    } else if (player === 'O') {
      if (this.mainGameBoard[x] === 'O') {
        if (this.winner === 'O') {
          this.oPlayerWeightsLarge[x] -= 1000;
        } else {
          this.oPlayerWeightsLarge[x] -= 100;
        }
      } else if (this.mainGameBoard[x] === 'T') {
        this.xPlayerWeightsLarge[x] = 0;
        this.oPlayerWeightsLarge[x] = 0;
      }
      for (let i = 0; i < 9; i += 1) {
        if (this.oPlayerWeightsSmall[x][i] !== 0) {
          this.oPlayerWeightsSmall[x][i] += this.substractiveWeightsToCell[y][i];
        }
      }
      this.xPlayerWeightsSmall[x][y] = 0;
    }
  }
};
