// leetcode problem 701 insert into a binary search tree

var insertIntoBST = function (root, val) {
  if (!root) return new TreeNode(val);

  if (root.val > val) {
    root.left = insertIntoBST(root.left, val);
  } else {
    root.right = insertIntoBST(root.right, val);
  }
  return root;
};
