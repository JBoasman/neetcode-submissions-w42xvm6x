class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode output = new ListNode(0, null);
        ListNode head = output;
        int carry = 0; 
        
        while (l1 != null || l2 != null || carry != 0) {
            
            int val1 = (l1 != null) ? l1.val : 0; //If sets to val or 0
            int val2 = (l2 != null) ? l2.val : 0;
            
            int sum = val1 + val2 + carry; //total at this position
            
            carry = sum / 10;       // e.g., 15 / 10 = 1 (Carry the 1): new carry
            int digit = sum % 10;   // e.g., 15 % 10 = 5 (Store the 5): digit at this node
            
            // 4. Create the new node and advance the output pointer
            output.next = new ListNode(digit, null); 
            output = output.next;
            
            // 5. Advance the input lists safely
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        // Return the actual head of the list (skipping the dummy zero)
        return head.next;
    }
}