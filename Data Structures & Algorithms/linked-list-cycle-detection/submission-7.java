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
    public boolean hasCycle(ListNode head) {
        if (head == null) { return false;}
        return cycleHelper(head, head.next);
    }

    public boolean cycleHelper(ListNode slow, ListNode fast) {
        if (fast != null && fast.next != null) {
            if (fast == slow || fast.next == slow) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
            return cycleHelper(slow, fast);
        } else { 
            return false;            
        }
    }
}
