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
        return diameterHelper(root, 0);
    }

    public int diameterHelper(TreeNode root, int maxDiameter) {
        if (root == null) {
            return maxDiameter;
        }
        if (nodeDiameter(root) < maxDiameter) {
            return Math.max(diameterHelper(root.left, maxDiameter), diameterHelper(root.right, maxDiameter));
        }
        return Math.max(diameterHelper(root.left, nodeDiameter(root)), diameterHelper(root.right, nodeDiameter(root)));
    }

    public int nodeDiameter(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return (maxDepth(root.left) + maxDepth(root.right));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
