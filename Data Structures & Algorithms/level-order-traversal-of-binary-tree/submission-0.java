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
        
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) { return list; }
        int level = 0;
        list.add(new ArrayList<>());
        helper(root, level, list);
        return list;
    }

    public void helper(TreeNode root, int level, List<List<Integer>> list) {
        if (root == null) { return; } //do nothing if caled on null;
        if (list.size() == level) {
            list.add(new ArrayList<>()); //since there is a value to add, add a new list into list;
        }
        list.get(level).add(root.val); //add right val to the new list in list;
        helper(root.left, level + 1, list); //run on the left branch at one index greater
        helper(root.right, level + 1, list); //run on the right branch at one index greater
    }
}
