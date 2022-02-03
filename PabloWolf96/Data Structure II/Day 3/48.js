// leetcode problem 48 rotate image
function rotate(matrix: number[][]): void {
  let lastIndex = matrix.length - 1;
  for (let i = 0; i < Math.floor(matrix.length / 2); i++) {
    for (let j = i; j < lastIndex - i; j++) {
      let top = matrix[i][j];
      let right = matrix[j][lastIndex - i];
      let bottom = matrix[lastIndex - i][lastIndex - j];
      let left = matrix[lastIndex - j][i];
      matrix[i][j] = left;
      matrix[j][lastIndex - i] = top;
      matrix[lastIndex - i][lastIndex - j] = right;
      matrix[lastIndex - j][i] = bottom;
    }
  }
}
