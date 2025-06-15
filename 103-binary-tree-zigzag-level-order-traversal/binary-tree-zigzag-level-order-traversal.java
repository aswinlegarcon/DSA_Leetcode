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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean flag = true;
        if(root==null) return ans;
        q.add(root);

        while(!q.isEmpty())
        {
            int size = q.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                temp.add(0);
            }
            for(int i=0;i<size;i++)
            {
                TreeNode node = q.poll();
                int index = flag ? i : size-1-i;

                temp.set(index,node.val);

                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }

            flag = !flag; // true - false || false - true
            ans.add(temp);
        }

        return ans;
    }
}