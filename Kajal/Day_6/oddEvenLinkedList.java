// https://leetcode.com/problems/odd-even-linked-list/

// Question

// Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
// The first node is considered odd, and the second node is even, and so on.
// Note that the relative order inside both the even and odd groups should remain as it was in the input.
// You must solve the problem in O(1) extra space complexity and O(n) time complexity.

// Example 1:

// Input: head = [1,2,3,4,5]
// Output: [1,3,5,2,4]

// Example 2:

// Input: head = [2,1,3,5,6,4,7]
// Output: [2,3,6,7,1,5,4]

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

// even  and odd index ki alg alg list bnao and baad me odd tail se even head join kr do

// https://www.youtube.com/watch?v=_VHInOZbp6A // Question Hint

class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode evenHead = null;
        ListNode evenTail = null;
        ListNode oddHead = null;
        ListNode oddTail = null;
        ListNode node = head;
           
        int count = 1; // to take count of index
        while(node != null){            
            if(count % 2 != 0){  // if index is odd
                if(oddHead == null){
               oddHead = node;
               oddTail = node;
               node = node.next;
                }
                else{
               oddTail.next = node;
               // node = oddTail;
               oddTail = oddTail.next;
               node = node.next;
                }
            }
            else{
                if(evenHead == null){  // if index is even
               evenHead = node;
               evenTail = node;
               node = node.next;
                }
                else{
               evenTail.next = node;
               // node = evenTail; 
               evenTail = evenTail.next;
               node = node.next;
                }
            }
            count++;
        }
        
        if(evenHead == null){
            return oddHead;
        }
        
        if(oddHead == null){
            return evenHead;
        }
        
        evenTail.next = null;
        oddTail.next = evenHead;
        
        return oddHead;
    }
}
