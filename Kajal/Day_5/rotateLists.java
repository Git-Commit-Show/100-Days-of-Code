// https://leetcode.com/problems/rotate-list/

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
  
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next==null || k == 0){
                 return head;
             }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode lengthNode = dummy;
        ListNode nodeBeforeRotatedPoint = dummy;
          
        // count length using lengthNode and lengthNode will be at end of list after end of while loop
        int length = 0;
        while(lengthNode.next != null){
            length++;
            lengthNode = lengthNode.next;
        }
                 
        // divide the list from head to length-k and length-k+1 to tail
        k = k % length;
        
        // nodeBeforeRotatedPoint REACH before the rotated point i.e length-k+1
        for(int i = 1; i <= length-k; i++){
            nodeBeforeRotatedPoint = nodeBeforeRotatedPoint.next;
        }
            
            // rotate
            lengthNode.next = dummy.next;
            dummy.next = nodeBeforeRotatedPoint.next;
            nodeBeforeRotatedPoint.next = null;
        
        return dummy.next;           
    }
}
