// leetcode problem 119 Pascal's Triangle II
var getRow = function (rowIndex) {
  if (!rowIndex) return [1];

  let res = [1, 1];

  while (--rowIndex) {
    const next = [];

    for (let i = 0; i < res.length - 1; i++) {
      next.push(res[i] + res[i + 1]);
    }
    res = [1, ...next, 1];
  }
  return res;
};
