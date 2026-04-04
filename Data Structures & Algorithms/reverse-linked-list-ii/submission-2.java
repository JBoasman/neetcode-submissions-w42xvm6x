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
        if (left == right) { return head; } //base case 1
        if (head == null) { return head; } //base case 2
        ListNode dummyHead = new ListNode(0, head); //dummy starting in point in case we are swapping from the first value;
        ListNode anchor = dummyHead;
        ListNode beforeReversed = new ListNode(0, null); //this allows us to point at the reversed list the we separate later on
        ListNode unchangedTail = new ListNode(0, null); //this allows us to point the reversed list as whatever tail remains;
        
        while (left > 1) { // will traverse through linked list stopping one node before the start of section we reverse
            dummyHead = dummyHead.next;
            left--;
            right--;
        }
        
        beforeReversed = dummyHead; //sets beforereversed as the precursor node to reversed list
        
        while (right > 0) { //will traverse through linked list stopping at the final node of tthe section we reverse
            right--;
            dummyHead = dummyHead.next;
        }
        
        unchangedTail = dummyHead.next; //sets unchangedTail to the next values so we can point to this tail later
        dummyHead.next = null; //cuts the list off so we only reverse the part we want to reverse
        
        beforeReversed.next = reverse(unchangedTail, beforeReversed.next); //reverses from the start of the reversed section, pointing at th tail we want to maintain normally, and is set as Beforereversed.next so now the unchanged beginning, the reveersed section and the unchanged tail are all conneccted.
        return anchor.next; //returns head because this still points at the very first value (but not the dummy head);
    } //i feel like dummyHead.next wont work though because we moved dummyHead in our earlier traverals?

    public ListNode reverse(ListNode rev, ListNode old) { //reverse function; works i think?
        ListNode temp = old.next;
        old.next = rev;
        rev = old;
        if (temp != null) { return reverse(rev, temp); }
        return rev;
    }
}