/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

*/
class Solution {
    // Function to check whether all nodes of a tree have the value
    // equal to the sum of their child nodes.
    public static int isSumProperty(Node root) {
        // add your code here
        if(root==null || root.left==null && root.right==null) return 1;
        
        int sum = 0;
        if(root.left!=null) sum += root.left.data;
        if(root.right!=null) sum += root.right.data;
        
        return ((sum==root.data) && (isSumProperty(root.left)==1) && (isSumProperty(root.right)==1)) ? 1:0;
    }
}