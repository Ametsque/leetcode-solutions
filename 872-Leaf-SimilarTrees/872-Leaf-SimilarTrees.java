// Last updated: 29/04/2025, 18:35:21
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leafValSeq1 = new ArrayList<>();
        ArrayList<Integer> leafValSeq2 = new ArrayList<>();
        preOrder(leafValSeq1, root1);
        preOrder(leafValSeq2, root2);

        if (leafValSeq1.size() != leafValSeq2.size()) {
            return false;
        }

        for (int i = 0; i < leafValSeq1.size(); i++) {
            if (!leafValSeq1.get(i).equals(leafValSeq2.get(i))) {
                return false;
            }
        }

        return true;
    }

    public ArrayList<Integer> preOrder(ArrayList<Integer> leafValSeq, TreeNode curr) {
        if (curr == null) {
            return leafValSeq;
        }
        if (curr.left == null && curr.right == null) {
            leafValSeq.add(curr.val);
        }
        preOrder(leafValSeq, curr.left);
        preOrder(leafValSeq, curr.right);
        return leafValSeq;
    }
}