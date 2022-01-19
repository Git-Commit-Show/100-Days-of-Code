// leetcode problem 350 Intersection of two arrays II
var intersect = function (nums1, nums2) {
  let lookUp = {};
  for (let num of nums1) {
    lookUp[num] = lookUp[num] + 1 || 1;
  }
  let intersection = [];
  for (let num of nums2) {
    if (lookUp[num]) {
      intersection.push(num);
      lookUp[num]--;
    }
  }
  return intersection;
};
