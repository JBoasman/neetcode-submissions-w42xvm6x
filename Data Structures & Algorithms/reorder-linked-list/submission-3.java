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
        if (head == null) { return; }
        ListNode slow = split(head, head, head.next);
        ListNode second = slow.next;
        slow.next = null;
        ListNode reversed = reverse(second, null);
        ListNode result = merge(head, reversed);
    }

    //split list 
    public ListNode split(ListNode head, ListNode slow, ListNode fast) {
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //reverse list 
    public ListNode reverse(ListNode head, ListNode end) {
        while (head != null) {
            ListNode next = head.next;
            head.next = end;
            end = head;
            head = next;
        }
        return end; 
    }

    //merge list
    public ListNode merge(ListNode head, ListNode reversed) {
        ListNode start = head;
        while (reversed != null) {
            ListNode next = head.next;
            head.next = reversed;
            reversed = reversed.next;
            head.next.next = next;
            head = head.next.next;
        }
        return start;
    }
}
