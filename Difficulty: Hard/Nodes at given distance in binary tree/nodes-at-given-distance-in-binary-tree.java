// class Node
// {
//     int data;
//     Node left, right;
// }

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
    
    public static ArrayList<Integer> KDistanceNodes(Node root, int t, int k) {
        // return the sorted list of all nodes at k dist
        HashMap<Node,Node> map = new HashMap<>(); 
        setParentNode(root,map);
        HashMap<Node,Boolean> visited = new HashMap<>();
        
        Node target = getTarget(root,t);
        Queue<Node> q = new LinkedList<>();
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
                Node temp = q.poll();
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
        
        ArrayList<Integer> ans = new ArrayList<>();
        while(!q.isEmpty())
        {
            ans.add(q.poll().data);
        }
        Collections.sort(ans);
        return ans;
    }
};