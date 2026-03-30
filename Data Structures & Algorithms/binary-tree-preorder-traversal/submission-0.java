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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traversalHelper(root, result);
        return result;

    }

    public void traversalHelper(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        } else {
            result.add(root.val);

            traversalHelper(root.left, result);

            traversalHelper(root.right, result);
        }   
    }
}