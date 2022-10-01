// leetcode problem 98 validate binary search tree
var isValidBST = function (root, min = null, max = null) {
  if (!root) return true;
  if (min && root.val <= min.val) return false;
  if (max && root.val >= max.val) return false;
  return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
};
