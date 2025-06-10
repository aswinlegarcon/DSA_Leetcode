/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        Node node = root;
        if(node == null) return ans;
        st1.push(node);
        while(!st1.isEmpty())
        {
            node = st1.pop();
            st2.push(node);
            if(node.left!=null) st1.push(node.left);
            if(node.right!=null) st1.push(node.right);
        }
        while(!st2.isEmpty())
        {
            ans.add(st2.pop().data);
        }
        return ans;
    }
}