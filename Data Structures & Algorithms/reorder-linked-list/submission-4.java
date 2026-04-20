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
        ListNode startOfSecond = endOfFirst.next;
        endOfFirst.next = null;
        //We now have two distinc half lists, starting at head and startOfSecond;
        ListNode reversed = reverseList(startOfSecond, null);
        mergeList(head, reversed);
    }
    
    public ListNode splitList(ListNode slow, ListNode fast) {
        if (fast == null || fast.next == null) { return slow; }
        return splitList(slow.next, fast.next.next);
    }
    
    public ListNode reverseList(ListNode given, ListNode rev) {
        if (given == null) { return rev; }
        ListNode temp = given.next;
        given.next = rev;
        return reverseList(temp, given);
    }

    public void mergeList(ListNode first, ListNode second) {
        if (second == null || first == null) {return;}
        ListNode temp = second.next;
        second.next = first.next;
        first.next = second;
        mergeList(first.next.next, temp);
    }

}
