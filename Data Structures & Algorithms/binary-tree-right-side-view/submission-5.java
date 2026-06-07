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
        List<Integer> output = new ArrayList<>();
        int depth = 0;
        store(root, depth, output);
        return output;
    }

    public void store(TreeNode root, int depth, List<Integer> output) {
        if (root == null) {return;}
        if (output.size() == depth) {
            output.add(root.val);
        } 
        store(root.right, depth + 1, output);
        store(root.left, depth + 1, output);
    }      
}
