// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
 
       if(head == null){
           return head;
       }
                
        ListNode start = new ListNode(0); //make a new node start at starting of list
        ListNode first = start; // point the start node first, second
        ListNode second = start;
        start.next = head; // start node will be before head node
        
        // move first to n+1 steps from head so that difference between first and second is n
        for(int i=1; i<=n+1;i++){
            first = first.next;
        } 
        
        // now move first and second one-one step until first is null
        while(first != null){
            first = first.next;
            second = second.next;
        }
        
        // when first is on null, second is at n+1 step from head and we can delete n+2th node that is nth node from end
        if(first == null){
        second.next = second.next.next;
    }
       return start.next;
    }
}
