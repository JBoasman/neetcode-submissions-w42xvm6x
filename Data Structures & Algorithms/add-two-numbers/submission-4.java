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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumList = l1;
        int carry = 0;
        while (l2 != null && sumList != null) {
            ListNode temp = l2.next;
            sumList.val = sumList.val + l2.val + carry;
            carry = 0;
            if (sumList.val > 9) {
                sumList.val = sumList.val - 10;
                carry = 1;
            }
            if (temp == null || sumList.next == null) {
                break;
            }
            l2 = temp;
            sumList = sumList.next;
        }
        while (l2.next != null) {
            sumList.next = new ListNode(l2.next.val + carry, null);
            carry = 0;
            if (sumList.next.val > 9) {
                sumList.next.val = sumList.next.val - 10;
                carry = 1;
            }
            sumList = sumList.next;
            l2 = l2.next;
        }
        while (sumList.next != null) {
            sumList.next.val = sumList.next.val + carry;
            carry = 0;
            if (sumList.next.val > 9) {
                sumList.next.val = sumList.next.val - 10;
                carry = 1;
            }
            sumList = sumList.next;
        }
        if (carry == 1) {
            sumList.next = new ListNode(1, null);
        }
        return l1; 
    }
}
