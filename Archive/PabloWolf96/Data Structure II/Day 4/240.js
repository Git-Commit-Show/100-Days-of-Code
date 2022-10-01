// leetcode problem 240 Search a 2D matrix II
var searchMatrix = function (matrix, target) {
  if (!matrix || matrix.length === 0 || matrix[0].length === 0) {
    return false;
  }
  const rows = matrix.length;
  const cols = matrix[0].length;
  let row = 0,
    col = matrix[0].length - 1;
  while (row < rows && col >= 0) {
    if (matrix[row][col] === target) {
      return true;
    }
    if (matrix[row][col] < target) {
      row++;
    } else {
      col--;
    }
  }
  return false;
};
