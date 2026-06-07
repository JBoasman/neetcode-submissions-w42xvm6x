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
        if (head == null || head.next == null) {
            return null;
        }
        ListNode toRemove = new ListNode (0, head);
        ListNode toReturn = toRemove;
        ListNode distanceToEnd = toRemove;
        while (n >= 0) {
            distanceToEnd = distanceToEnd.next;
            n--;
        }
        while (distanceToEnd != null) {
            distanceToEnd = distanceToEnd.next;
            toRemove = toRemove.next;
        }
        toRemove.next = toRemove.next.next;
        return toReturn.next;
    }
}
