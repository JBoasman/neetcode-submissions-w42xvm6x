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
    public int kthSmallest(TreeNode root, int k) {
        int leftCount = countNodes(root.left); //Returns the number of nodes in root.left;
        if (k <= leftCount) { //If number of nodes <= k
            return kthSmallest(root.left, k); //run again with root.left as root
        } 
        else if (k == leftCount + 1) { //If leftNodes + 1 (the root) is equal, return root.val
            return root.val;
        } 
        else {
            return kthSmallest(root.right, k - leftCount - 1); //kth element is somehwere in right tree;
        }
    }
    

    private int countNodes(TreeNode node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
}
