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
    // Global variables so our helper method can access them
    private int preorderIndex;
    private Map<Integer, Integer> inorderIndexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIndex = 0;
        inorderIndexMap = new HashMap<>();
        
        // 1. Build a HashMap to instantly find the "breakpoint" in O(1) time
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i); //stores value, followed by index
        }
        
        // 2. Start the recursion looking at the entire inorder array (0 to length - 1)
        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int inorderStart, int inorderEnd) {
        // Base case: If there are no elements left to build, return null
        if (inorderStart > inorderEnd) {
            return null;
        }

        // 1. The current root is always the next item in the preorder array!
        int rootVal = preorder[preorderIndex++]; // Get the value, then increment the index
        TreeNode root = new TreeNode(rootVal);

        // 2. Find where this root splits the inorder array
        int mid = inorderIndexMap.get(rootVal);

        // 3. Build the left and right subtrees!
        // NOTE: You MUST build the left subtree first, because preorder goes Root -> Left -> Right
        root.left = build(preorder, inorderStart, mid - 1); // Everything left of 'mid'
        root.right = build(preorder, mid + 1, inorderEnd);  // Everything right of 'mid'

        return root;
    }
}
