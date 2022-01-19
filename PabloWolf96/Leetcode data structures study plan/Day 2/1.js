// leetcode problem 1 two sum
var twoSum = function (nums, target) {
  const lookUp = {};
  for (let i = 0; i < nums.length; i++) {
    let compliment = target - nums[i];
    if (lookUp[compliment] !== undefined) {
      return [i, lookUp[compliment]];
    } else {
      lookUp[nums[i]] = i;
    }
  }
};
