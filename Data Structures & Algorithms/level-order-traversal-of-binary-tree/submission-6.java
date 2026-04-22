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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        helper(root, 0, output);
        return output;
    }

    public void helper(TreeNode root, int depth, List<List<Integer>> output) {
        if (root == null) { return; }
        if (depth >= output.size()) {
            List<Integer> level = new ArrayList<>();
            output.add(level);
        }
        output.get(depth).add(root.val);
        helper(root.left, depth + 1, output);
        helper(root.right, depth + 1, output);
    }
}
