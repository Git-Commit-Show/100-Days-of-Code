// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/

// Question
// You are given the head of a linked list, and an integer k.

// Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

// Example
// Input: head = [1,2,3,4,5], k = 2
// Output: [1,4,3,2,5]

// Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
// Output: [7,9,6,6,8,7,3,0,9,5]

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
    
     /////////////////////method 1 optimised, TC-O(n), SC-O(1)//////////////////////////

// two pointers algo used to swap node values 
// Runtime: 3 ms, faster than 74.04% of Java online submissions for Swapping Nodes in a Linked List.
// Memory Usage: 193.6 MB, less than 29.74% of Java online submissions for Swapping Nodes in a Linked List.
    
// Hint: https://leetcode.com/problems/swapping-nodes-in-a-linked-list/discuss/1009918/Java-or-Two-Pointers-or-Detailed-Explanation-or-O(n)-time-O(1)-space
    
     public ListNode swapNodes(ListNode head, int k){
         
         ListNode first = head;
         ListNode second = head;
         ListNode kthNodeFromStart = head;
         ListNode kthNodeFromEnd = head;
         
         // move first node to k-1 place
         for(int i=1;i<k;i++){
             first = first.next;
         }
         
         // store first node for swapping
         kthNodeFromStart = first;
         
         // now move first and second one step until first is at last node
         while(first.next != null){
             first = first.next;
             second = second.next;
         }
         
         // store second node for swapping
         kthNodeFromEnd = second;
         
         // swap node values
         int temp = kthNodeFromStart.val;
         kthNodeFromStart.val = kthNodeFromEnd.val;
         kthNodeFromEnd.val = temp;
         
         return head;
         
     }
         
    /////////////////////method 2 not so optimised//////////////////////////
 
    // Runtime: 32 ms, faster than 5.25% of Java online submissions for Swapping Nodes in a Linked List.
// Memory Usage: 201.2 MB, less than 8.60% of Java online submissions for Swapping Nodes in a Linked List.
    
    // method to return length of list
    public int findLength(ListNode head){
         
        ListNode count = head;        
        int length = 0;
        while(count != null){
            length++;
            count=count.next;
        }
        return length;
    }
    
    // method to return converted array of list
    public int[] convertArray(ListNode head){
        
        int len = findLength(head);
        int index = 0;
        int[] arr = new int[len];
        ListNode node = head;
        
       while(node != null){
           arr[index++] = node.val;
           node = node.next;
       }
        return arr;
    }
    
    // method to convert array into list again through inserting elements in form of nodes in list
    public ListNode insertElementsInList(ListNode start, int element){
        
        ListNode node = new ListNode();
            node.val = element;
            node.next = start;
            start = node;    
        
        return start;
    }
    
    // main method, perform swapping and reconverting array in list
    public ListNode swapNodes(ListNode head, int k) {
        
        
        if(head.next == null){
            return head;
        }
        
            int[] arr = convertArray(head);
        
            // swapping
            int temp = arr[k-1];
            arr[k-1] = arr[arr.length-k];
            arr[arr.length-k] = temp;
        
        // convert array to list
        ListNode start = null;
        for(int i= arr.length-1;i>=0;i--){
          start = insertElementsInList(start, arr[i]);         
        }
        return start;
    }
}
