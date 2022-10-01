// leetcode problem 383 ransom note
var canConstruct = function (ransomNote, magazine) {
  let frequency = {};
  for (let char of magazine) {
    frequency[char] = frequency[char] + 1 || 1;
  }

  for (let char of ransomNote) {
    if (!frequency[char]) {
      return false;
    }
    frequency[char]--;
  }
  return true;
};
