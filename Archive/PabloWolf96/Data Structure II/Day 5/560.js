// leetcode problem 560 subarray sum equals K
var subarraySum = function (nums, k) {
  let map = new Map();
  let sum = 0;
  let count = 0;
  map.set(0, 1);
  for (let num of nums) {
    sum += num;
    if (map.has(sum - k)) count += map.get(sum - k);
    map.set(sum, (map.get(sum) || 0) + 1);
  }
  return count;
};
