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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) { return null; }
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node found! 
            // We want to get rid of 'root' and return its right child,
            // but first we must tuck the left child into the right child's basement.
            return insertIntoBST(root.right, root.left);
        }
        return root;
    }    

    public TreeNode insertIntoBST(TreeNode root, TreeNode temp) {
        if (temp == null) { return root; }
        if (root == null) { return temp; }
        root.left = insertIntoBST(root.left, temp);
        return root;
    }
}