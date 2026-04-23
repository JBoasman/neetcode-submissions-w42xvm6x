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
        helper(l1, l2, 0);
        return l1;
    }

    public void helper(ListNode l1, ListNode l2, int carry) {
        if (l1 == null || l2 == null) { return; }
        int sum = l1.val + l2.val + carry;
        if (sum > 9) {
            carry = 1;
            sum = sum - 10;
        } else {
            carry = 0;
        }
        l1.val = sum;
        if (l2.next == null && l1.next == null) {
            if (carry == 1) {
                l1.next = new ListNode(carry, null);
                return;
            } else {
                return;
            }
        } else if (l2.next == null) {
            carryHelper(l1.next, carry);
        } else if (l1.next == null) {
            carryHelper(l2.next, carry);
            l1.next = l2.next;
        } else {
            helper(l1.next, l2.next, carry);
        }
    }

    public void carryHelper(ListNode node, int carry) {
        if (node == null) { return; }
        int sum = node.val + carry;
        if (sum > 9) {
            carry = 1;
            sum = sum - 10;
        } else {
            carry = 0;
        }
        node.val = sum;
        if (node.next == null && carry == 1) {
            node.next = new ListNode(carry, null);
            carry = 0;
        }
        carryHelper(node.next, carry);
    }
}
