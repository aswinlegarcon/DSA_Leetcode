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
    public void setParentNode(TreeNode root,HashMap<TreeNode,TreeNode> map)
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            root = q.poll();
            if(root.left!=null) 
            {
                map.put(root.left,root);
                q.add(root.left);
            }
            if(root.right!=null)
            {
                map.put(root.right,root);
                q.add(root.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) 
    {
        HashMap<TreeNode,TreeNode> map = new HashMap<>(); 
        setParentNode(root,map);
        HashMap<TreeNode,Boolean> visited = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        visited.put(target,true);
        int distance = 0;
        while(!q.isEmpty())
        {
            if(distance==k) break;
            int size = q.size();
            distance++;
            for(int i=0;i<size;i++)
            {
                TreeNode temp = q.poll();
                if(temp.left!=null && visited.get(temp.left)==null)
                {
                    q.add(temp.left);
                    visited.put(temp,true);
                }
                if(temp.right!=null && visited.get(temp.right)==null)
                {
                    q.add(temp.right);
                    visited.put(temp,true);
                }
                if(map.get(temp)!=null && visited.get(map.get(temp))==null)
                {
                    q.add(map.get(temp));
                    visited.put(map.get(temp),true);
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty())
        {
            ans.add(q.poll().val);
        }
        return ans;
        
    }
}