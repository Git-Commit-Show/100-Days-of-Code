// leetcode problem 136 single number
var singleNumber = function (nums) {
  let num = 0;
  for (let n of nums) {
    num ^= n;
  }
  return num;
};
