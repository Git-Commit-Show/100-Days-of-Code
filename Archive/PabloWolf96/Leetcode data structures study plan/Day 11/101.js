// leetcode problem 101 symmetric tree
var isSymmetric = function (root) {
  return matchNodes(root.left, root.right);
};

function matchNodes(left, right) {
  if (left === null || right === null) {
    return left === right;
  }

  if (left.val !== right.val) {
    return false;
  }

  return (
    matchNodes(left.left, right.right) && matchNodes(left.right, right.left)
  );
}
