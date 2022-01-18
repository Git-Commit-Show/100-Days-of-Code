// leetcode problem 217 contains duplicate

// my initial solution
var containsDuplicate = function (nums) {
  let lookUpTable = {};
  for (let num of nums) {
    if (!lookUpTable[num]) {
      lookUpTable[num] = 1;
    } else {
      return true;
    }
  }

  return false;
};

// set solution
var containsDuplicate2 = function (nums) {
  const set = new Set(nums);
  return set.size < nums.length;
};
