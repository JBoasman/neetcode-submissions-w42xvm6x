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
        ListNode rev = null;
        ListNode current = head;
        ListNode temp = null;
        while (current != null) {
            temp = current.next; //save current.next
            current.next = rev; //re-direct head to rev
            rev = current; //more rev pointer to new rev head
            current = temp; //more current to new current head
        }
        return rev;
    }
}
