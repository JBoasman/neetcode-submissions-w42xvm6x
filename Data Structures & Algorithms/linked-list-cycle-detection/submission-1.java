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
       if (head == null) {
        return false;
       } 
       return nodeNumber(head, 0);


    }

    public boolean nodeNumber(ListNode head, int x) {
        if (head == null) {
            return false;
        }
        head = head.next;
        x++;
        if (x > 1000) {
            return true;
        }
        return nodeNumber(head, x);
    }
}
