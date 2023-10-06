const tuttt = require('./uttt.test.js');

// Syntactical sugar for copying object using JSON.
function deepCopy(obj) {
  try {
    return JSON.parse(JSON.stringify(obj));
  } catch (e) {
    console.log('Failed to deeply copy: ', obj, '\nError: ', e);
    return null;
  }
}

module.exports = class buttt extends tuttt {
  constructor() {
    super();
  }

  // Predicts winning chance for current opponent after the next move
  listCurrentWeights() {
    const currentSmallBoards = deepCopy(this.smallBoards);
    // const currentLargeBoard = deepCopy(super.largeBoard);
    const currentBoard = deepCopy(currentSmallBoards[this.move[1]]);
    const currentSmallWeights = {
      X: deepCopy(this.xWeightsSmall),
      O: deepCopy(this.oWeightsSmall),
    };
    const currentPlayer = this.turn;
    const currentCellWeights = [];
    // Player Turn: X, move: 4, currentBoard: 4
    // CheckWin on each move
    // List weights with currentsmallboard cell data
    currentBoard.forEach((cell, index) => {
      currentCellWeights.push([cell, currentSmallWeights[currentPlayer][this.move[1]][index]]);
    });
    return currentCellWeights;
  }

  minimax() {
    // NEW PRINCIPLE: deep copy vs shallow copy in js.

  }
};
