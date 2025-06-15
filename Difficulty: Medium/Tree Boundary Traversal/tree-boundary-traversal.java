/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    
    private boolean isLeaf(Node node)
    {
        return (node.left == null && node.right==null);
    }
    
    public void leftOrder(Node node,ArrayList<Integer> ans)
    {
        Node cur = node.left;
        while(cur!=null)
        {
            if(!isLeaf(cur)) ans.add(cur.data);
            if(cur.left!=null) cur = cur.left;
            else cur = cur.right;
        }
    }
    
    public void rightOrder(Node node, ArrayList<Integer> ans)
    {
        Node cur = node.right;
        Stack<Integer> st = new Stack<>();
        while(cur!=null)
        {
            if(!isLeaf(cur)) st.push(cur.data);
            if(cur.right!=null) cur = cur.right;
            else cur = cur.left;
        }
        
        while(!st.isEmpty())
        {
            ans.add(st.pop());
        }
    }
    
    public void leafNode(Node node , ArrayList<Integer> ans)
    {
        if(isLeaf(node))
        {
            ans.add(node.data);
            return;
        }
        if(node.left!=null) leafNode(node.left,ans);
        if(node.right!=null) leafNode(node.right,ans);
    }
    
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(!isLeaf(node)) ans.add(node.data);
        leftOrder(node,ans);
        leafNode(node,ans);
        rightOrder(node,ans);
        return ans;
    }
}