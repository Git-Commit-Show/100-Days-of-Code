// leetcode problem 700 Search in a binary search tree
var searchBST = function (root, val) {
  if (!root) return null;
  if (root.val === val) return root;
  if (root.val > val) return searchBST(root.left, val);
  if (root.val < val) return searchBST(root.right, val);
};
