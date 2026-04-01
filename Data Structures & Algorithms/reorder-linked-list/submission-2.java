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
    public void reorderList(ListNode head) {
            if (head != null) {
            ListNode slow = head;
            ListNode fast = head.next;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode secondHalf = slow.next;
            slow.next = null;
            secondHalf = reverse(secondHalf);
            merge(head, secondHalf);
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode reversed = null;
        return reverseHelper(head, reversed);
    }

    public ListNode reverseHelper(ListNode head, ListNode reversed) {
        if (head == null) { return reversed; }
        ListNode temp = head.next;
        head.next = reversed;
        reversed = head;
        return reverseHelper(temp, reversed);
    }

    public ListNode merge(ListNode firstHalf, ListNode secondHalf) {
        if (secondHalf == null) {
            return firstHalf;
        }
        ListNode temp1 = firstHalf.next;
        ListNode temp2 = secondHalf.next;
        firstHalf.next = secondHalf;
        firstHalf.next.next = merge(temp1, temp2);
        return firstHalf;
    }
}
