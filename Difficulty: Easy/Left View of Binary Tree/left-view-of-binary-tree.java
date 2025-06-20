/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Solution {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root,0,ans);
        return ans;
    }
    
    public void helper(Node root,int level,ArrayList<Integer> ans)
    {
        if(root==null) return;

        if(level==ans.size()) ans.add(root.data);
        helper(root.left,level+1,ans);
        helper(root.right,level+1,ans);
        
    }
}