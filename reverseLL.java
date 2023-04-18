/**Given the head of a singly linked list, reverse the list, and return the reversed list.
 * 
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
class reverseLL {
    public ListNode reverseList(ListNode head) {
          
    ListNode head2 = null;
    while (head != null) {
        //1. Store the next node in a temp variable
        ListNode next = head.next;
        //2. Point the current node to the previous node
        head.next = head2;
        //3. Set this node as the previous node
        head2 = head;
        //4. Set the next node as the current node
        head = next;
    }
    //5. Return the head of the reversed LL
    return head2;
    }
}