/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 * 
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
    public ListNode middleNode(ListNode head) {
        // Get the length of the list
        int i=0;
        for(ListNode temp = head ; temp!=null;temp=temp.next){
            i++;
        }
        // Find the middle node element
        i=i/2;
        // Return the middle node
        for(ListNode temp = head ; temp!=null ; temp = temp.next,i--){
            if(i==0){
                return temp;
            }
        }
        return head;
    }
}