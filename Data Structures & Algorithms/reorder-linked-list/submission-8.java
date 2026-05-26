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
        ListNode endOfFirst = splitList(head, head.next);
        ListNode reversed = reverseList(endOfFirst.next, null);
        endOfFirst.next = null;
        mergeList(head, reversed);
    }
    
    public ListNode splitList(ListNode slow, ListNode fast) {
        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverseList(ListNode given, ListNode rev) {
        while (given != null) {
            ListNode temp = given.next;
            given.next = rev;
            rev = given;
            given = temp;
        }
        return rev; 
    }

    public void mergeList(ListNode first, ListNode second) {
        while (second != null && first != null) {
            ListNode temp = second.next;
            second.next = first.next;
            first.next = second;
            first = first.next.next; 
            second = temp;  
        }
    }
}

