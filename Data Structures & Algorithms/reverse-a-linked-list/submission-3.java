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
        return helper(head, null);
    }

    public ListNode helper(ListNode head, ListNode rev) {
        if (head == null) { return rev; }
        ListNode temp = head.next;
        head.next = rev;
        rev = head;
        head = temp;
        return helper(head, rev);
    }
}
