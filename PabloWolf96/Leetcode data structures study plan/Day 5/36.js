// leetcode problem 36 valid sudoku
var isValidSudoku = function (board) {
  let seen = new Set();
  for (let i = 0; i < board.length; i++) {
    for (let j = 0; j < board[i].length; j++) {
      if (board[i][j] === ".") continue;
      let currentSize = seen.size;
      seen.add(`${board[i][j]} found at row ${i}`);
      seen.add(`${board[i][j]} found at column ${j}`);
      seen.add(
        `${board[i][j]} found at box ${Math.floor(i / 3)} ${Math.floor(j / 3)}`
      );
      if (seen.size !== currentSize + 3) return false;
    }
  }
  return true;
};
