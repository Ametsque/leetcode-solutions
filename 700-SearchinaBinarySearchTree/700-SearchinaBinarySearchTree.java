// Last updated: 29/04/2025, 14:49:57
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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null){
            return null;
        } 
        if (root.val == val){
            return root;
        }

        TreeNode value = searchBST(root.left, val);
        if (value == null) {
            value = searchBST(root.right, val);
        }
        
        return value;
    }
}