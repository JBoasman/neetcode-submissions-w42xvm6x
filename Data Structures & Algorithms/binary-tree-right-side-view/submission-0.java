/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) { return list; }

        //Creating a queue
        Queue<TreeNode> breadthQueue = new LinkedList<>();
        breadthQueue.add(root);

        while (!breadthQueue.isEmpty()) {
            int levelSize = breadthQueue.size();
            int toAdd =0;

            while (levelSize > 0) {
                TreeNode currentNode = breadthQueue.poll(); //remove first element;
                toAdd = (currentNode.val);

                // Add children to the queue for the NEXT level; queues add to end of list.
                if (currentNode.left != null) {
                    breadthQueue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    breadthQueue.add(currentNode.right);
                }
                levelSize--;  
            }
            list.add(toAdd);
        }
        return list;
    }
}
