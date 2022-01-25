// leetcode problem 21 merge two sorted lists

var mergeTwoLists = function (list1, list2) {
  if (!list1 || !list2) return list1 || list2;
  let head = new ListNode(null);
  let current = head;
  while (list1 && list2) {
    if (list1.val <= list2.val) {
      current.next = list1;
      list1 = list1.next;
    } else {
      current.next = list2;
      list2 = list2.next;
    }
    current = current.next;
  }
  current.next = list1 || list2;
  return head.next;
};
