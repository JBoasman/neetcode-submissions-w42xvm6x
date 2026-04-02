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
        ListNode fast = fastFinder(head, n);
        if (fast == null) {
            return head.next; //should only occur when dropping the first value.
        } 
        helper(head, fast);
        return head;
    }

    public ListNode fastFinder(ListNode fast, int n) {
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        return fast;
    }

    public void helper(ListNode slow, ListNode fast) {
        if (fast.next == null) {
            slow.next = slow.next.next;
        } else {
            helper(slow.next, fast.next);
        }
    }
}
