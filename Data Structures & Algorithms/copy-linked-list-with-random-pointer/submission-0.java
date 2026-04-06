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
        HashMap<Node, Node> randomMemory = new HashMap<>();
        Node newNode = convert(head, randomMemory);
        Node traversal = newNode;
        while (traversal != null) {
            traversal.random = randomMemory.get(traversal.random);
            traversal = traversal.next;
        }
        return newNode;
    }

    public Node convert(Node head, HashMap randomMemory) {
        if (head == null) { return null; }
        Node newNode = new Node(0);
        newNode.val = head.val;
        newNode.next = convert(head.next, randomMemory);
        newNode.random = head.random;
        randomMemory.put(head, newNode);
        return newNode;
    }
}
