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
    public int diameterOfBinaryTree(TreeNode root) {
        return helper(root);
    }

    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        int nodeDiamter = left + right;
        return Math.max(nodeDiamter, Math.max(helper(root.left), helper(root.right)));

    }

        public int maxDepth(TreeNode root) {
        if (root == null) { return 0; }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
