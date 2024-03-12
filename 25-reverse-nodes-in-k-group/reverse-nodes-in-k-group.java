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
        ListNode temp = head,prevLast=null;
        while(temp!=null){
            ListNode kThNode = getKthNode(temp,k);
            if(kThNode == null){
                if(prevLast!=null){
                    prevLast.next = temp;
                }
                break;
            }
            ListNode nextNode = kThNode.next;
            kThNode.next = null;

            reverseLinkedList(temp);
            if(temp==head){
                head = kThNode;
            }
            else{
                 prevLast.next = kThNode;
            }
            prevLast = temp;
            temp = nextNode;

        }
        return head;
    }

    public static ListNode getKthNode(ListNode temp, int k) {
        // Decrement K as we already
        // start from the 1st node
        k -= 1;
        
        // Decrement K until it reaches
        // the desired position
        while (temp != null && k > 0) {
            // Decrement k as temp progresses
            k--;
            
            // Move to the next node
            temp = temp.next;
        }
        
        // Return the Kth node
        return temp;
    }
static ListNode reverseLinkedList(ListNode head) {
        // Initialize'temp' at
        // head of linked list
        ListNode temp = head;  
   
       // Initialize pointer 'prev' to NULL,
       // representing the previous node
       ListNode prev = null;  
       
       // Traverse the list, continue till
       // 'temp' reaches the end (NULL)
       while(temp != null){  
           // Store the next node in
           // 'front' to preserve the reference
           ListNode front = temp.next;  
           
           // Reverse the direction of the
           // current node's 'next' pointer
           // to point to 'prev'
           temp.next = prev;  
           
            // Move 'prev' to the current
            // node for the next iteration
           prev = temp;  
           
            // Move 'temp' to the 'front' node
            // advancing the traversal
           temp = front; 
       }
       
       // Return the new head of
       // the reversed linked list
       return prev;  

    }
}