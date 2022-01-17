// leetcode problem 53 maximum subarray
var maxSubArray = function (nums) {
  let maxSum;
  let currentSum;

  for (let num of nums) {
    if (maxSum === undefined) {
      maxSum = num;
      currentSum = maxSum;
      continue;
    }
    let extend = currentSum + num;
    currentSum = num > extend ? num : extend;

    maxSum = maxSum > currentSum ? maxSum : currentSum;
  }
  return maxSum;
};
