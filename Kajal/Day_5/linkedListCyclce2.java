// https://leetcode.com/problems/linked-list-cycle-ii/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// Linkedlist cycle Problem
// Pattern: Fast and slow pointer
// Usage: cycle detection in linkedlist and finding a node where cycle starts

// here we are finding node where cycle starts

public class Solution {
    public ListNode detectCycle(ListNode head) {
        int lengthCycle = 0;
        
        // finding length of cycle
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                lengthCycle = length;
                break;
            }
        }
        if(lengthCycle == 0){
            return null;
        }
        
        // finding the second node in cycle
        ListNode first = head;
        ListNode second = head;
        
        while(lengthCycle > 0){
            second = second.next;
            lengthCycle--;
        }
        
        // keep moving first and second forward and they'll meet at cycle start node
        while(first != second){
            first = first.next;
            second = second.next;
        }
    
       return second; 
    }
}
