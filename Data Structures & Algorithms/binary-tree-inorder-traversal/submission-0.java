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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        collect(root, result);
        return result;
    }

    public void collect(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        collect(node.left, list);
        
        list.add(node.val);

        collect(node.right, list);
    }
}