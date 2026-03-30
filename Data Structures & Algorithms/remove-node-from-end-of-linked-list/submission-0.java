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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode lengthCheck = head;
        while (lengthCheck != null) {
            lengthCheck = lengthCheck.next;
            count++;
        }
        if (count == n) { return head = head.next; }
        int toRemove = 0;
        ListNode pointer = head;
        while (toRemove < (count - n - 1)) {
            pointer = pointer.next;
            toRemove++;
        }
        pointer.next = pointer.next.next;
        return head;
    }
}
