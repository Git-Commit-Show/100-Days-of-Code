// Question Link
// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/

// Question
// Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. 
// Return the linked list sorted as well.

// Example 1:

// Input: head = [1,2,3,3,4,4,5]
// Output: [1,2,5]

// Example 2:

// Input: head = [1,1,1,2,3]
// Output: [2,3]

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

// fast node will be at last node of duplicate
// slow will be before fast to delete duplicate nodes

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode fast = head;
        ListNode slow = dummy;
        
        while(fast != null){
            while(fast.next != null && fast.val == fast.next.val){ // loop to find last index of duplicate number
                fast = fast.next;
            }
            if(slow.next != fast){ // this means fast is at the last index of duplicate
                slow.next = fast.next;
                fast = fast.next;                
            } else{
                // no duplicate found so move both the nodes
                slow = slow.next;
                fast = fast.next;
            }
        }
        return dummy.next;
    }
}
