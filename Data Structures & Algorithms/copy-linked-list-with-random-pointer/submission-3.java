/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    
    public Node copyRandomList(Node head) {
        Map<Node, Node> mapping = new HashMap<>();
        Node copy = new Node (0);
        Node randomSet = copy; //points at head
        Node toReturn = copy;
        while (head != null) {
            copy.next = new Node (head.val);
            mapping.put(head, copy.next); //old node link mapped to its copy
            copy = copy.next;
            copy.random = head.random;
            head = head.next;
        }  
        randomSet = randomSet.next;
        while (randomSet != null) {
            randomSet.random = mapping.get(randomSet.random); //uses old node link to retrieve and set random to copy node 
            randomSet = randomSet.next;
        }
        return toReturn.next;
    }
}

