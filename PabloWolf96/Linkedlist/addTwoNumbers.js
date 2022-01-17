// my initial solution
function addTwoNumbers(l1, l2) {
  let carry = 0;
  let listA = l1;
  let listB = l2;
  let head;
  let sumList;
  let valA;
  let valB;
  while (listA || listB) {
    if (listA) {
      valA = listA.val;
    } else {
      valA = 0;
    }
    if (listB) {
      valB = listB.val;
    } else {
      valB = 0;
    }

    let sum = (valA + valB + carry) % 10;
    carry = Math.floor((valA + valB + carry) / 10);
    if (!head) {
      head = new ListNode(sum);
      sumList = head;
    } else {
      sumList.next = new ListNode();
      sumList = sumList.next;
      sumList.val = sum;
    }

    if (listA) listA = listA.next;
    if (listB) listB = listB.next;
  }
  if (carry) {
    sumList.next = new ListNode(carry);
  }

  return head;
}
