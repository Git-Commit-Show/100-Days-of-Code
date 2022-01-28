// 3 x 3 matrix

/*1 2 3
  4 5 6
  7 8 9 */

const matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];

for (let index = 0; index < matrix.length; index++) {
  console.log(matrix[index], `(equals matrix[${index}])`);
}
let n = matrix.length;

for (let index = 0; index < n; index++) {
  for (let i = 0; i < n; i++) {
    console.log(`${index}, ${i}`);
  }
}

function plusMinus(arr) {
  // let arr = new Array();
  let pos = 0;
  let neg = 0;
  let zero = 0;

  len = arr.length || 0;
  if (len > 0 && len <= 100) {
    arr.map((elem) => {
      if (elem > 0) {
        return pos++;
      } else if (elem < 0) {
        return neg++;
      } else {
        zero++;
      }
      return elem;
    });
  }
  console.log(neg / len || 0);
  console.log(pos / len || 0);
  console.log(zero / len || 0);
}
plusMinus([1, 2, 3, 4]);
