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
    public boolean isSymmetric(TreeNode root) {
        TreeNode tree1 = root.left;
        TreeNode tree2 = root.right;
        return helper(tree1,tree2);
    }

    public boolean helper(TreeNode left,TreeNode right)
    {
        if(left==null || right==null) return left==right;
        if(left.val!=right.val) return false;

        return helper(left.left,right.right) && helper(left.right,right.left);
    }
}