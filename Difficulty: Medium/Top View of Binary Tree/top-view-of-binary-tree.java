/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Pair{
    Node first;
    int second;
    Pair(Node first,int second)
    {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair p = q.poll();
            Node temp = p.first;
            int line = p.second;
            if(map.get(line)==null) map.put(line,temp.data);
            if(temp.left!=null) q.add(new Pair(temp.left,line-1));
            if(temp.right!=null) q.add(new Pair(temp.right,line+1));
        }
        
        for(int val:map.values())
        {
            ans.add(val);
        }
        
        return ans;
        
    }
}