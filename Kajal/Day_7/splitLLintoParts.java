// https://leetcode.com/problems/split-linked-list-in-parts/

// Question

// Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.

// The length of each part should be as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being null.

// The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal to parts occurring later.

// Return an array of the k parts.

// Example 1:

// Input: head = [1,2,3], k = 5
// Output: [[1],[2],[3],[],[]]

// Explanation:
// The first element output[0] has output[0].val = 1, output[0].next = null.
// The last element output[4] is null, but its string representation as a ListNode is [].

// Example 2:

// Input: head = [1,2,3,4,5,6,7,8,9,10], k = 3
// Output: [[1,2,3,4],[5,6,7],[8,9,10]]

// Explanation:
// The input has been split into consecutive parts with size difference at most 1, and earlier parts are a larger size than the later parts.

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
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        ListNode node = head;
        ListNode prev = null;
        int count = 0;
        
        while(node != null){
            node = node.next;
            count++;
        }
        
        int partSize = count/k;  // each part size
        int rem = count%k;  // extra nodes
        
        ListNode[] parts = new ListNode[k];
        node = head;
        
        for(int i=0; node != null && i<k ; i++){
            parts[i] = node;
            for(int j=0; j < partSize + (rem>0 ? 1 : 0 ); j++){ 
                // if rem>0 true than add 1 or add 0
                prev = node;
                node = node.next;                
            }
            if(rem>0){
                rem--;
            }
            prev.next = null;
        }
                
       return parts; 
    }
}
