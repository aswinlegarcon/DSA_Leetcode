class Solution {
    // Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        // write code here
        Stack<Node> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        st.push(root);
        while(!st.isEmpty())
        {
            root = st.pop();
            ans.add(root.data);
            if(root.right!=null) st.push(root.right);
            if(root.left!=null) st.push(root.left);
            
            
        }
        return ans;
    }
}