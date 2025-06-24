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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;

        int left = findLeft(root);
        int right = findRight(root);

        if(left==right) return ((2<<left)-1);

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int findLeft(TreeNode root)
    {
        int cnt = 0;
        while(root.left!=null)
        {
            cnt++;
            root = root.left;
        }
        return cnt;
    }

    public int findRight(TreeNode root)
    {
        int cnt = 0;
        while(root.right!=null)
        {
            cnt++;
            root = root.right;
        }
        return cnt;
    }
}