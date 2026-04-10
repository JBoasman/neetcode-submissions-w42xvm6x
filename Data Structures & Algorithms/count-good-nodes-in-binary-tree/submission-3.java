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
    public int goodNodes(TreeNode root) {
        return helper(root, root.val);
    }

    public int helper(TreeNode root, int largest) {
        if (root == null) { return 0; }
        if (root.val >= largest) {
            largest = root.val;
            return 1 + helper(root.right, largest) + helper(root.left, largest);
        }
        return helper(root.right, largest) + helper(root.left, largest);
    }
}
