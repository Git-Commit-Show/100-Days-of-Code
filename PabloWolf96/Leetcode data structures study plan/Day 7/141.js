// leetcode problem 141 Linked list cycle
var hasCycle = function(head) {
    // Use fast and slow pointers to find cycle
    // If fast pointer is behind slow, there is cycle
    let fast = slow = head;
    
    while(fast && fast.next !== null) {
        if(fast.next == slow) return true;
        fast = fast.next.next;
        slow = slow.next;        
    }
    return false;
};
