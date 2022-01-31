// leetcode problem 203 remove linked list element

var removeElements = function (head, val) {
  while (head && head.val === val) {
    head = head.next;
  }

  let prev = head;
  let current;
  if (prev) {
    current = prev.next;
  }
  while (current) {
    if (current.val === val) {
      prev.next = current.next;
    } else {
      prev = current;
    }
    current = prev.next;
  }

  return head;
};
