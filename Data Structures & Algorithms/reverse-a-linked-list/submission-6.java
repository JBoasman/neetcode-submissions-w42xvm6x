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
    public ListNode reverseList(ListNode head) {
        ListNode rev = null;
        ListNode temp = null;
        while (head != null) {
            temp = head.next; //save head.next
            head.next = rev; //re-direct head to rev
            rev = head; //more rev pointer to new rev head
            head = temp; //more head to new head head
        }
        return rev;
    }
}
