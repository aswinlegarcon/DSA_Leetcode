/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}  */
class Solution {
    public static void setParentNode(Node root,HashMap<Node,Node> map)
    {
        Queue<Node> q = new LinkedList<>();
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
    
    public static Node getTarget(Node root, int target) {
        if (root == null) return null;
        
        if (root.data == target) return root;
        
        Node left = getTarget(root.left, target);
        if (left != null) return left;
        
        return getTarget(root.right, target);
    }
    
    
    public static int minTime(Node root, int t) {
        // code here
        HashMap<Node,Node> map = new HashMap<>();
        setParentNode(root,map);
        Queue<Node> q = new LinkedList<>();
        HashMap<Node,Boolean> vis = new HashMap<>();
        Node target = getTarget(root,t);
        q.add(target);
        vis.put(target, true);
        int time = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            boolean check = false;
            for(int i=0;i<size;i++)
            {
                Node temp = q.poll();
                if(temp.left!=null && vis.get(temp.left)==null)
                {
                    check = true;
                    q.add(temp.left);
                    vis.put(temp.left,true);
                }
                if(temp.right!=null && vis.get(temp.right)==null)
                {
                    check = true;
                    q.add(temp.right);
                    vis.put(temp.right,true);
                }
                if(map.get(temp)!=null && vis.get(map.get(temp))==null)
                {
                    check = true;
                    q.add(map.get(temp));
                    vis.put(map.get(temp),true);
                }
            }
            if(check)
            {
                time++;
            }
        }
        return time;
        
    }
}