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
    public ListNode reverseList(ListNode head) {
        return reverseHelper(head, null);
    } 

    public ListNode reverseHelper(ListNode head, ListNode reversed) {
        if (head == null) {
            return reversed;
        }
        ListNode temp = new ListNode(head.val);
        temp.next = reversed;
        head = head.next;
        return reverseHelper(head, temp);
    } 
}
