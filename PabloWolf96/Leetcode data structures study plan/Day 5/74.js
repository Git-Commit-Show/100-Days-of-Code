// Leetcode problem 74 Search a 2D Matrix
var searchMatrix = function (matrix, target) {
  let rows = matrix.length;
  let columns = matrix[0].length;
  let left = 0;
  let right = rows * columns - 1;
  while (left <= right) {
    let midPoint = Math.floor((right + left) / 2);
    let midPointElement =
      matrix[Math.floor(midPoint / columns)][midPoint % columns];
    if (target === midPointElement) return true;
    if (target < midPointElement) {
      right = midPoint - 1;
    } else {
      left = midPoint + 1;
    }
  }
  return false;
};
