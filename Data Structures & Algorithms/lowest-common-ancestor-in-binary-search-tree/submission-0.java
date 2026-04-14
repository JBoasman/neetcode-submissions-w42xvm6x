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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if we hit null or find one of the targets
        if (root == null || root.val == p.val || root.val == q.val) {
            return root;
        }

        // Look for p and q in the left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both sides returned a non-null value, it means p is on one side
        // and q is on the other. This node is the LCA!
        if (left != null && right != null) {
            return root;
        }

        // Otherwise, return the one that isn't null (if any)
        if (left != null) {
            return left;
        } else {
            return right;
        }
    }
}