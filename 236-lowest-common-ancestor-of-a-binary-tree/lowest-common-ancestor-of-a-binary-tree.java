/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path1 = new ArrayList<>();
        helper(root,path1,p.val);
        ArrayList<TreeNode> path2 = new ArrayList<>();
        helper(root,path2,q.val);
        TreeNode LCA = null;
        int i = 0;
        
        while (i < path1.size() && i < path2.size()) 
        {
            if (path1.get(i) == path2.get(i)) 
            {
                LCA = path1.get(i);
            } 
            else 
            {
                break;
            }
            i++;
        }

        return LCA;
    }

    public boolean helper(TreeNode root, ArrayList<TreeNode> path, int x)
    {
        if(root==null) return false;

        path.add(root);

        if(root.val==x) return true;

        if(helper(root.left,path,x) || helper(root.right,path,x))
        {
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }
}