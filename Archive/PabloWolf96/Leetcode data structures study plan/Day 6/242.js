// leetcode problem 242 valid anagram

var isAnagram = function (s, t) {
  if (s.length !== t.length) {
    return false;
  }
  let frequency = {};
  for (let char of t) {
    frequency[char] = frequency[char] + 1 || 1;
  }

  for (let char of s) {
    if (!frequency[char]) {
      return false;
    }
    frequency[char]--;
  }
  return true;
};
