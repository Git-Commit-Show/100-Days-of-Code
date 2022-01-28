// https://leetcode.com/problems/reverse-nodes-in-k-group/

// Question

// Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

// k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

// You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

// Example 1:

// Input: head = [1,2,3,4,5], k = 2
// Output: [2,1,4,3,5]

// Example 2:

// Input: head = [1,2,3,4,5], k = 3
// Output: [3,2,1,4,5]

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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        /////// pointer approach ////////
        
        if(head == null || k == 1){
            return head;
        }
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = dummy;
        ListNode next = dummy;
        ListNode node = head;
        int count = 0;
        
        while(node != null){
            node = node.next;
                count++;
        }
        
        // we are reversing every group of size k from here
        while(count>=k){  // iterate till no.of element before entering in each grp>=k
            curr = prev.next; // make sure curr is standing at first of that grp beacuse prev will stand at last end of prev grp
            next = curr.next;  // and next is standing at second of that grp
            for(int i=1;i<k;i++){  // loop to reverse k-1 links like of grp 3 we need to reverse 3-1 connections eg. 3->2->1 i.e 2 connections to be reversed in 3 elements grp
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
            next = curr.next;
            } 
            count = count-k;
            prev = curr;  // now prev goes back to curr because we need to prev stands at last node of previously reversed group of size k
        }
        return dummy.next;
    }
}
        
        
//  ////////////// recusrive approach /////////
///// not working /////
//          // base case
//         if(head == null){
//             return null;
//         }
        
//         // reverse first k nodes
//         ListNode prev = null;
//         ListNode present = head;
//         ListNode next = present.next;
//         int count = 0; // keep track of nodes reverse
        
//         while(present != null && count < k){
//             present.next=prev;
//             prev = present;
//             present = next;
//             if(next!=null){
//             next = next.next;
//             }
//             count++;
//         }
        
//         // recusive call
//         if(next != null){
//             head.next = reverseKGroup(next, k);
//         }
        
//         // return head of previous list
//         return prev;
    // }
// }
