// leetcode problem 144 Binary Tree Preorder Traversal

var preorderTraversal = function (root) {
  if (!root) return [];
  var result = [];
  var stack = [root];

  while (stack.length) {
    var node = stack.pop();
    result.push(node.val);
    if (node.right) stack.push(node.right);
    if (node.left) stack.push(node.left);
  }
  return result;
};
