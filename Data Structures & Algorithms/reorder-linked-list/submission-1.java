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
        int switcher = 0;
        ListNode midPoint = splitList(head);
        ListNode toReverse = midPoint.next;
        midPoint.next = null;
        ListNode reversed = reverseList(toReverse);
        mergeList(head, reversed);
    }

    public ListNode splitList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

public ListNode reverseList(ListNode head) {
        ListNode rev = null;
        while (head != null) {
            ListNode nextTemp = head.next; 
            head.next = rev;              
            rev = head;                   
            head = nextTemp;               
        }
        return rev;
    }

    public ListNode mergeList(ListNode one, ListNode two) {
        if (one == null || two == null) { return one; }
        ListNode temp1 = one.next;
        ListNode temp2 = two.next;
        one.next = two;
        one.next.next = temp1;
        mergeList(one.next.next, temp2);
        return one;
    }
}
