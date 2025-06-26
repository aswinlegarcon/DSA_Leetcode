/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return null;
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        q.add(root);
        sb.append(root.val).append(",");
        while(!q.isEmpty())
        {
            TreeNode node = q.poll();
            if(node.left==null) {sb.append("#,");}
            else
            {
                sb.append(node.left.val).append(",");
                q.add(node.left);
            }

            if(node.right==null) {sb.append("#,");}
            else
            {
                sb.append(node.right.val).append(",");
                q.add(node.right);
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==null) return null;
        String[] arr = data.split(",");
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        q.add(root);
        for(int i=1;i<arr.length;i+=2)
        {
            TreeNode temp = q.poll();
            if(!arr[i].equals("#")) 
            {
                temp.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(temp.left);
            }
            if(i + 1 < arr.length && !arr[i+1].equals("#"))
            {
                temp.right = new TreeNode(Integer.parseInt(arr[i+1]));
                q.add(temp.right);
            }
        }
        return root;

    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));