// leetcode proble 20 Valid Parentheses
var isValid = function (s) {
  let parentheses = {
    "}": "{",
    "]": "[",
    ")": "(",
  };
  let stack = [];
  for (let char of s) {
    if (!parentheses[char]) {
      stack.push(char);
    } else if (parentheses[char] === stack[stack.length - 1]) {
      stack.pop();
    } else {
      return false;
    }
  }
  return stack.length === 0;
};
