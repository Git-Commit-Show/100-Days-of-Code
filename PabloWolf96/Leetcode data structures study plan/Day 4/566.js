// leetcode problem 566
var matrixReshape = function (mat, r, c) {
  if (mat.length * mat[0].length !== r * c) {
    return mat;
  }
  let result = [];
  let col = 0;
  for (let i = 0; i < mat.length; i++) {
    for (let j = 0; j < mat[i].length; j++) {
      if (col === c) {
        col = 0;
      }
      if (col === 0) {
        result.push([]);
      }
      result[result.length - 1].push(mat[i][j]);
      col++;
    }
  }
  return result;
};
