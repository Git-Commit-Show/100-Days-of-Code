// leetcode problem 653 Two sum IV - input is BST
var findTarget = (root, k, nums = new Map([])) => {
  if (!root) return false;
  if (nums.has(root.val)) return true;
  nums.set(k - root.val, 0);
  return findTarget(root.left, k, nums) || findTarget(root.right, k, nums);
};
