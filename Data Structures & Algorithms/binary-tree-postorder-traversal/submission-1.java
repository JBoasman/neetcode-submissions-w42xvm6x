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
    List<Integer> output = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        traversalHelper(root);
        return output;
    }

    public void traversalHelper(TreeNode root) {
        if (root == null) {
            return;
        } else {
            traversalHelper(root.left);
            traversalHelper(root.right);
            output.add(root.val);
        }
    }
}