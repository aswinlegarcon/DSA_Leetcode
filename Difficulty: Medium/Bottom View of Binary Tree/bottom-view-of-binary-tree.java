/*
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references

    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
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
    public ArrayList<Integer> bottomView(Node root) {
        // Code here
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
            map.put(line,temp.data);
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