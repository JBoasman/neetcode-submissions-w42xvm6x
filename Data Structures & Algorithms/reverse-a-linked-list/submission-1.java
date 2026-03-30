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
        return reverseHelper(null, head);
    }

    public ListNode reverseHelper(ListNode rev, ListNode norm) {
        if (norm == null) {
            return rev;
        }
        ListNode tempNorm = norm.next;
        norm.next = rev;
        return reverseHelper(norm, tempNorm);
    }
}
