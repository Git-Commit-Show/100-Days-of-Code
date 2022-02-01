// leetcode problem 15 3sum

var threeSum = function (nums) {
  let resArr = [];
  nums.sort((a, b) => a - b);
  for (let i = 0; i < nums.length - 2; i++) {
    if (i > 0 && nums[i] === nums[i - 1]) continue;

    let l = i + 1,
      r = nums.length - 1;
    while (l < r) {
      const sum = nums[i] + nums[l] + nums[r];
      if (sum === 0) {
        resArr.push([nums[i], nums[l], nums[r]]);
        l++;
        r--;
        while (l < r && nums[l] === nums[l - 1]) l++;
      } else if (sum > 0) {
        r--;
      } else {
        l++;
      }
    }
  }

  return resArr;
};
