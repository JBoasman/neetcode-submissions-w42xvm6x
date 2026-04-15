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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> valForDepth = new ArrayList<>();
        helper(root, 0, valForDepth);
        return valForDepth;

    }

    public void helper(TreeNode root, int depth, List<Integer> valForDepth) {
        if (root == null) { return; }

        if (depth == valForDepth.size()) {
            valForDepth.add(root.val);
        }
        
        helper(root.right, depth + 1, valForDepth);
        helper(root.left, depth + 1, valForDepth);
    }
}
