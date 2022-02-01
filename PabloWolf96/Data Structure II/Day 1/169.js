// leetcode problem 169 Majority Element
var majorityElement = function (nums) {
  let frequency = {};
  for (let num of nums) {
    frequency[num] = frequency[num] + 1 || 1;
    if (frequency[num] > nums.length / 2) return num;
  }
};
