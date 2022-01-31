//https://leetcode.com/problems/reorder-list/

// Question

// You are given the head of a singly linked-list. The list can be represented as:

// L0 → L1 → … → Ln - 1 → Ln
// Reorder the list to be on the following form:

// L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
// You may not modify the values in the list's nodes. Only nodes themselves may be changed.

// Example 1:

// Input: head = [1,2,3,4]
// Output: [1,4,2,3]

// Example 2:

// Input: head = [1,2,3,4,5]
// Output: [1,5,2,4,3]


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

// find mid
// divide in two parts by making mid.next= null
// reverse from mid.next
// traverse in both parts node by node and then merge

class Solution {
    
   // method for finding middle node of list 
       public ListNode middleNode(ListNode head){
       
        //    ListNode midPrev = null;
        //    while(head!=null && head.next!=null){
        //     midPrev = midPrev==null ? head : midPrev.next;
        //     head = head.next.next;
        // }
        // ListNode mid = midPrev.next;
        // midPrev.next = null;
        // return mid;
        // }
    
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

     // method to reverse second half of linked list
        public ListNode reverseList(ListNode head) {
             
            if(head == null || head.next==null){
                 return head;
             }
             ListNode previous = null;
             ListNode present = head;
             ListNode next = head.next;
             
             while(present != null){
                 present.next = previous;
                 previous = present;
                 present = next;
                 if(next != null){
                 next = next.next;
                 }
             }
             head = previous;
             return previous;
         }
    
    public void reorderList(ListNode head) {
         
        if(head == null || head.next == null){
            return;
        }
            // calling methods to get middle and reverse second half
            ListNode mid = middleNode(head);  // start finding mid from head
        
            ListNode headOfSecondHalf = reverseList(mid.next); // reverse list from mid.next
            mid.next = null; // mid ka next make null so that we get two halves
            ListNode firstHead = head;  // first half ka head
            
        // merging both second half
            while(firstHead != null && headOfSecondHalf != null){
               // here we need a temp var in each half to store head next var 
                ListNode temp1 = firstHead.next;
                ListNode temp2 = headOfSecondHalf.next;
                
                // connecting nodes
                firstHead.next = headOfSecondHalf;
                headOfSecondHalf.next = temp1;
                
                // update both heads
                firstHead = temp1;
                headOfSecondHalf = temp2;
            }
        }
    }
