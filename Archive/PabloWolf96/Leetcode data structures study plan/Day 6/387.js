// leetcode problem 387 first unique character in a string
var firstUniqChar = function (s) {
  let frequency = {};
  for (let char of s) {
    frequency[char] = frequency[char] + 1 || 1;
  }
  for (let i = 0; i < s.length; i++) {
    if (frequency[s[i]] === 1) {
      return i;
    }
  }
  return -1;
};
