// leetcode problem 21 merge two sorted lists

var mergeTwoLists = function(list1, list2) {
    let head = new ListNode();
    let tail = head;
    
    while(list1 && list2) {
        if(list1.val  < list2.val) {
            tail.next = list1;
            list1 = list1.next;
        } else {
            tail.next = list2;
            list2 = list2.next;
        }
        tail = tail.next;
    }
    
    tail.next = list1 === null ? list2 :list1;
    
    return head.next;
};
