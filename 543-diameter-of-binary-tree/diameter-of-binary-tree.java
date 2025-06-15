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
    public int diameterOfBinaryTree(TreeNode root) {
        int max[] = new int[1];
        helper(root,max);
        return max[0];
    }

    public int helper(TreeNode node, int[] max)
    {
        if(node==null) return 0;

        int[] lh = new int[1];
        lh[0] = helper(node.left,max);
        int[] rh = new int[1];
        rh[0] = helper(node.right,max);

        max[0] = Math.max(max[0],lh[0]+rh[0]);

        return 1 + Math.max(lh[0],rh[0]);
    }
}