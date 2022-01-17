
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

// Intution

// Convert list into array. first cal length of list, make new array, same length will be of array
// then convert array of binary string into decimal

class Solution {
    
    // // METHOD 1 
    // fn to return length of list
    public int findListLength(ListNode head){
        ListNode node = head;
        int count = 0;
        while(node != null){
            count++;
            node = node.next;
        }
        return count;
    }
    
        // fn to convert list into array using length of list
    public int[] convertArray(ListNode head){
        
        // find the length of given list
        int len = findListLength(head);
        
        // create array of required length as len of list and array should be same
        int[] arr = new int[len];
        
        int index = 0;
        ListNode node = head;
        
        // traverse through list and store values in the array one by one
        while(node != null){
            arr[index++] = node.val;
            node = node.next;
        }
        return arr;
    }
    
    public int getDecimalValue(ListNode head) {
    
        int[] arr = convertArray(head);
            int ans = 0;
            int decimalAns = 0;
            int index = 0;
        
        // now convert array(binary string) into decimal
        while(index < arr.length){
            ans = (arr[index]*(int)(Math.pow(2,(arr.length-index-1))));
            decimalAns = decimalAns + ans;
            index++;
        }
        return decimalAns;
    }
    
    // METHOD 2 (OPTIMISED)
     public int getDecimalValue2(ListNode head){
        
        int num = head.val;
        while(head.next!=null){
          num = num*2 + head.next.val;
            head = head.next;
        }
        return num;
        
    }
}
