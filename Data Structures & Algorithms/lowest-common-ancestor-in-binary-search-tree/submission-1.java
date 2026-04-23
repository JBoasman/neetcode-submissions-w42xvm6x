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
        if (root.val == p.val || root.val == q.val) return root;
        boolean left = found(root.left, p, q);
        boolean right = found(root.right, p, q);
        if (left && right) {
            return root;
        } else if (left) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return lowestCommonAncestor(root.right, p, q);
        }
        //Check if node has "found one" on left AND on right; if so yes; otherwise check down the tree that did return found.    
    }

    public boolean found(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        if (root.val == p.val || root.val == q.val) return true;
        return found(root.left, p, q) || found(root.right, p, q);
    }




}
