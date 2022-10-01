// leetcode problem 145 Binary Tree Postorder Traversal
var postorderTraversal = function (root) {
  if (!root) return [];

  let stack = [root];
  let arr = [];

  while (stack.length) {
    let curr = stack.pop();

    if (curr.left) stack.push(curr.left);
    if (curr.right) stack.push(curr.right);

    arr.unshift(curr.val);
  }

  return arr;
};
