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
        return inorder(root,new ArrayList<>());
    }

    public List<Integer> inorder(TreeNode root,ArrayList<Integer> list)
    {
        if(root==null) return list;

        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
        return list;
    }
}