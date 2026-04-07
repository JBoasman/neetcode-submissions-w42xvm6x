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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) { return list; }

        //Creating a queue
        Queue<TreeNode> breadthQueue = new LinkedList<>();
        breadthQueue.add(root);

        while (!breadthQueue.isEmpty()) {
            int levelSize = breadthQueue.size();
            List<Integer> currentLevelValues = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = breadthQueue.poll(); //remove and return first element;
                currentLevelValues.add(currentNode.val);

                // Add children to the queue for the NEXT level; queues add to end of list.
                if (currentNode.left != null) {
                    breadthQueue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    breadthQueue.add(currentNode.right);
                }
            }
            
            list.add(currentLevelValues);
        }
        return list;
    }
}
