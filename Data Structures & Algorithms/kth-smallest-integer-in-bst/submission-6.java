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
    public int distance = 0;
    public int output = 0;
    
    public int kthSmallest(TreeNode root, int k) {
        distance = 0;
        output = 0;
        helper(root, k);
        return output;
    }

    public void helper(TreeNode root, int k) {
        if (root == null || distance >= k) return;
        helper(root.left, k);
        distance = distance + 1;
        if (distance == k) {
            output = root.val;
            return;
        } 
        helper(root.right, k);
    }
}
