// leetcode problem 238 product of array except self
var productExceptSelf = function (nums) {
  var result = [];
  var left = 1;
  var right = 1;
  for (var i = nums.length - 1; i >= 0; i--) {
    result[i] = right;
    right *= nums[i];
  }
  for (var j = 0; j < nums.length; j++) {
    result[j] *= left;
    left *= nums[j];
  }
  return result;
};
