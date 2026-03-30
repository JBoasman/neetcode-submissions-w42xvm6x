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

        // Use a dummy to handle the case where we reverse starting from the head
        ListNode dummy = new ListNode(0, head);
        ListNode nodeBeforeReverse = dummy;
        
        // 1. Move to the node right before the reversal starts
        for (int i = 1; i < left; i++) {
            nodeBeforeReverse = nodeBeforeReverse.next;
        }

        // 2. Setup reversal pointers
        ListNode walkingNode = nodeBeforeReverse.next; 
        ListNode newReversedList = null;
        ListNode endOfReversedPart = walkingNode; // This will become the tail of the reversed segment

        // 3. Perform the reversal
        for (int i = 0; i <= right - left; i++) {
            ListNode nextTemp = walkingNode.next;
            walkingNode.next = newReversedList;
            newReversedList = walkingNode;
            walkingNode = nextTemp;
        }

        // 4. Reconnect the pieces
        nodeBeforeReverse.next = newReversedList;
        endOfReversedPart.next = walkingNode;

        return dummy.next;
    }
}