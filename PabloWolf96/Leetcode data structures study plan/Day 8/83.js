// leetcode Remove duplicates from sorted list

var deleteDuplicates = function (head) {
  let frequency = {};
  let current = head;
  let prev = null;
  while (current) {
    frequency[current.val] = frequency[current.val] + 1 || 1;
    if (frequency[current.val] > 1) {
      prev.next = current.next;
    } else {
      prev = current;
    }
    current = prev.next;
  }
  return head;
};
