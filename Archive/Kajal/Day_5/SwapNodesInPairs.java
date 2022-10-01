// https://leetcode.com/problems/swap-nodes-in-pairs/

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

// the main funda is to just draw what we want and then write code by seeing input and output.
// Linkedlist is all about this

class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode previous = dummy;
        
        while(previous.next != null && previous.next.next != null){
            // first and second node
            ListNode first = previous.next;
            ListNode second = previous.next.next;
            
            // swapping nodes
            first.next = second.next;
            previous.next = second;
            second.next = first;
            
            // updating previous node
            previous = previous.next.next;
                  
        }        
        return dummy.next;
    }
}
