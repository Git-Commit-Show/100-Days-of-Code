// leetcode problem 104 Maximum depth of binary tree
const maxDepth = function (root) {
  if (root === null) {
    return root;
  }
  return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
};
