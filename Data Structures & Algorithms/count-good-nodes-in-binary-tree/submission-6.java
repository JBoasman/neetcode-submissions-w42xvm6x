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
    int count = 0;
    public int goodNodes(TreeNode root) {
        helper(root, root.val);
        return count;
    }

    public void helper(TreeNode root, int maxSoFar) {
        if (root == null) { return; }
        if (root.val < maxSoFar) {
            helper(root.left, maxSoFar);
            helper(root.right, maxSoFar);
        }
        if (root.val >= maxSoFar) {
            count++;
            maxSoFar = root.val;
            helper(root.left, maxSoFar);
            helper(root.right, maxSoFar);
        }
    }
}
