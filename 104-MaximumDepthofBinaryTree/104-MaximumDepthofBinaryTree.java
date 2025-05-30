// Last updated: 29/04/2025, 13:37:47
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
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftDepth = 1;
        int rightDepth = 1;
        leftDepth += maxDepth(root.left);
        rightDepth += maxDepth(root.right);

        if (rightDepth > leftDepth){
            return rightDepth;
        } else {
            return leftDepth;
        }
    }
}