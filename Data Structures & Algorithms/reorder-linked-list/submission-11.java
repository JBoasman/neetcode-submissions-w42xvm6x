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
        if (head == null || head.next == null) { return;}
        
        //split list 
        ListNode firstHalf = head;
        ListNode firstHalfEnd = splitNode(head);
        ListNode secondHalf = firstHalfEnd.next;
        firstHalfEnd.next = null;

        //reverse second list
        ListNode secondHalfReversed = reverse(secondHalf);
        
        //return merged lists 
        merge(firstHalf, secondHalfReversed);
    }

    public ListNode splitNode(ListNode head) {
        ListNode splitPointer = head;
        ListNode endPointer = head;
        while (endPointer != null && endPointer.next != null) {
            endPointer = endPointer.next.next;
            splitPointer = splitPointer.next;
        }
        return splitPointer;
    }

    public ListNode reverse(ListNode head) {
        ListNode reversed = null;
        ListNode temp = null;
        while (head != null) {
            temp = head.next;
            head.next = reversed;
            reversed = head;
            head = temp;
        }
        return reversed;
    }

    public void merge(ListNode first, ListNode second) {
        ListNode temp = null;
        while (second != null) {
            temp = first.next;
            first.next = second;
            second = second.next;
            first.next.next = temp;
            first = first.next.next;
        }
    }
}
