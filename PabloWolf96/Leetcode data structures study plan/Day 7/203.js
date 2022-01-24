// leetcode problem 203 remove linked list element

var removeElements = function(head, val) {
    if (head == null) {
      return head;
    }
    
    // Check the head.val first
    while (head != null && head.val === val) {
      head = head.next;
    }
    
    let curr = head;
    
    // Head maybe deleted, check if it's null
    if (curr != null) {
      // Head is for sure has different value, check the next node
      while (curr.next != null) {
        if (curr.next.val === val) {
          curr.next = curr.next.next;
        }
        else {
          curr = curr.next;
        }
      }
    }
    
    return head;
  };
