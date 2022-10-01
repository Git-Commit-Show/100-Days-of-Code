// leetcode problem 335 Increasing triplet subsequence
var increasingTriplet = function (nums) {
  let min1 = nums[0],
    min2 = Number.MAX_VALUE;
  for (let num of nums) {
    if (num > min2) return true;
    if (num > min1) min2 = num;
    else min1 = num;
  }
  return false;
};
