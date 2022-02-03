// leetcode problem 59 spiral matrix II
var generateMatrix = function (n) {
  let possibleDirection = [
    { name: "r", x: 1, y: 0 },
    { name: "d", x: 0, y: 1 },
    { name: "l", x: -1, y: 0 },
    { name: "u", x: 0, y: -1 },
  ];
  let row = 0;
  let col = 0;
  let pointer = 0;
  let results = [];
  for (let i = 0; i < n; i++) {
    results.push([]);
  }
  results[0][0] = 1;
  for (let i = 2; i <= n * n; i++) {
    if (
      (pointer === 0 &&
        (col === n - 1 || results[row][col + 1] !== undefined)) ||
      (pointer === 1 &&
        (row === n - 1 || results[row + 1][col] !== undefined)) ||
      (pointer === 2 && (col === 0 || results[row][col - 1] !== undefined)) ||
      (pointer === 3 && (row === 0 || results[row - 1][col] !== undefined))
    ) {
      pointer = (pointer + 1) % 4;
    }
    row += possibleDirection[pointer].y;
    col += possibleDirection[pointer].x;
    results[row][col] = i;
  }
  return results;
};
