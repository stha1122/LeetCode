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
    public boolean isPalindrome(ListNode head) {
     
     ListNode fast =  head;
     ListNode slow = head;

     // Finding the middle of the linked list
     while(fast!=null && fast.next!=null){
         fast = fast.next.next;
         slow = slow.next;
     }

    ListNode prev = null;
    
    // Reversing the second half of the linked list
    while(slow!=null){
        ListNode newNext = slow.next;
        slow.next = prev;
        prev = slow;
        slow = newNext;
    }

    ListNode left = head;
    ListNode right =  prev;
    
    // Comparing the first and reversed second half
    while(right!=null){
        if(left.val != right.val)
        {
            return false;
        }
        left = left.next;
        right = right.next;
    }
    return true;

    }
}