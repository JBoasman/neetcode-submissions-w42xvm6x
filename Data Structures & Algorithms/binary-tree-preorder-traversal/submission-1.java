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
    public List<Integer> preorderTraversal(TreeNode root) {
        traversalHelper(root);
        return output;
    }

    public void traversalHelper(TreeNode root) {
        if (root == null) {
            return;
        } else {
            output.add(root.val);
            traversalHelper(root.left);
            traversalHelper(root.right);
        }
    }
}