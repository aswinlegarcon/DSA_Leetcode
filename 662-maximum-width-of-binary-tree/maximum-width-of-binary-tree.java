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
class Pair{
    TreeNode node;
    int index;

    Pair(TreeNode node,int index)
    {
        this.node = node;
        this.index = index;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int max = 0;
        Queue<Pair> q = new LinkedList<>();
        if(root==null) return 0;
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            int minInd = q.peek().index;
            int size = q.size();
            int first = 0;
            int last = 0;
            for(int i=1;i<=size;i++)
            {
                int newInd = q.peek().index - minInd;
                TreeNode node = q.poll().node;
                if(i==1) first = newInd;
                if(i==size) last = newInd;
                if(node.left!=null) q.add(new Pair(node.left,2*newInd+1));
                if(node.right!=null) q.add(new Pair(node.right,2*newInd+2));
            }
            max = Math.max(max,last-first+1);
        }
        return max;
    }
}