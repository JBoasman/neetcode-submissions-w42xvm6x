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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode (0, null);
        ListNode newListHead = newList;
        while (list1 != null) {
            if (list2 == null) {
                newList.next = list1;
                newList = newList.next;
                list1 = list1.next;
            } else if (list1.val <= list2.val) {
                newList.next = list1;
                newList = newList.next; //move newListPointer to end of new list
                list1 = list1.next;
            } else {
                newList.next = list2;
                newList = newList.next; //move newListPointer to end of new list
                list2 = list2.next;
            }
        }
        newList.next = list2;
        return newListHead.next;
    }
}