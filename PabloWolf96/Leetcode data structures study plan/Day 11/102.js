// leetcode problem 102 Binary Tree Level Order Traversal
var levelOrder = function (root) {
  if (root === null) return [];
  let output = [];
  let level = [root];
  while (level.length) {
    let values = level.map((i) => i.val);
    output.push(values);
    level = level
      .map((i) => {
        let o = [];
        if (i.left !== null) o.push(i.left);
        if (i.right !== null) o.push(i.right);
        return o;
      })
      .flat();
  }
  return output;
};
