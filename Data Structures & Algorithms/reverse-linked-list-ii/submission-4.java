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
    public int index = 1;
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) { return head; }
        if (index == left) {
            ListNode endRev = head;
            ListNode startRev = null;
            ListNode temp = null;
            while (index <= right) {
                index++;
                temp = head.next;
                head.next = startRev;
                startRev = head;
                head = temp;
            }
            endRev.next = temp;
            return startRev;
        } else {
            index++;
            head.next = reverseBetween(head.next, left, right);
        }
        return head;
    }
}