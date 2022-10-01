//https://leetcode.com/problems/partition-list/

// Question

// Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
// You should preserve the original relative order of the nodes in each of the two partitions.

// Example 1:

// Input: head = [1,4,3,2,5,2], x = 3
// Output: [1,2,2,4,3,5]

// Example 2:

// Input: head = [2,1], x = 2
// Output: [1,2]

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

// same like https://leetcode.com/problems/odd-even-linked-list/ approach

class Solution {
    public ListNode partition(ListNode head, int x) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode node = head;
        ListNode lessTail = null;
        ListNode lessHead = null;
        ListNode moreTail = null;
        ListNode moreHead = null;
        
        while(node != null){
            if(node.val < x){
                if(lessHead == null){
                    lessHead = node;
                    lessTail = node;
                    node = node.next;
                }
                else{
                    lessTail.next = node; // add new node after lessTail
                    lessTail = lessTail.next; // assign lessTail to new node
                    node = node.next;
                }
            }
            else{
                if(moreHead == null){
                    moreHead = node;
                    moreTail = node;
                    node = node.next;
                }
                else{
                    moreTail.next = node; // add new node after moreTail
                    moreTail = moreTail.next; // assign moreTail to new node
                    node = node.next;
                }
            }
        }
        
        if(lessHead == null){
            return moreHead;
        }
        
        if(moreHead == null){
            return lessHead;
        }
        
        moreTail.next = null;
        lessTail.next = moreHead; 
        
        return lessHead;
    }
}
