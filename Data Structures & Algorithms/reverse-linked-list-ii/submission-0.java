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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        // 1. Setup Dummy to handle the "left = 1" case
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode walkingNode = dummy;

        // 2. Move 'walkingNode' to the node right before the reversal starts to traverse to one node prior to the reversed section
        for (int i = 0; i < left - 1; i++) {
            walkingNode = walkingNode.next;
        }

        // 3. Start the reversal
        // 'start' will eventually be the end of the reversed segment
        ListNode start = walkingNode.next; 
        ListNode then = start.next;

        // 4. Perform the "Bridge" reversal
        // Instead of a separate function, we 'jump' nodes over 'walkingNode'
        for (int i = 0; i < right - left; i++) {
            start.next = then.next;
            then.next = walkingNode.next;
            walkingNode.next = then;
            then = start.next;
        }

        return dummy.next;
    }
}