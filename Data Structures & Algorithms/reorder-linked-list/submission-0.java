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

        ListNode middle = head;
        ListNode end = head;
        while (end != null && end.next != null) {
            end = end.next.next;
            middle = middle.next;
        }

        //reverses a given liinked list; given second half of linked list;
        ListNode prev = null;
        ListNode curr = middle.next; //[0, 1, 2, 3, 4, 5, 6] will disconnect 3 from 4?
        middle.next = null; // Disconnect the two halves; [0, 1, 2, 3] and [4, 5, 6]
        while (curr != null) {
            ListNode nextTemp = curr.next; //5
            curr.next = prev; //4 -> null
            prev = curr; //prev = 4;
            curr = nextTemp; // curr = 5, repeat for 5, then 6, then = null and break,
            //[0, 1, 2, 3] and [6, 5, 4]
        }

        //merge two halves 
        ListNode first = head;
        ListNode second = prev;
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;

            first.next = second;
            second.next = tmp1;

            first = tmp1;
            second = tmp2;
        }
    
        
    }
}
