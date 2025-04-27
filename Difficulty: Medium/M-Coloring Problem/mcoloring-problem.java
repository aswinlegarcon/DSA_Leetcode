//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine().trim());

        while (t-- > 0) {
            int V = Integer.parseInt(sc.nextLine().trim());
            int E = Integer.parseInt(sc.nextLine().trim());

            List<int[]> edgeList = new ArrayList<>();

            for (int i = 0; i < E; i++) {
                String[] parts = sc.nextLine().split(" ");
                int u = Integer.parseInt(parts[0]);
                int v = Integer.parseInt(parts[1]);
                edgeList.add(new int[] {u, v});
                edgeList.add(new int[] {v, u});
            }

            int[][] edges = new int[edgeList.size()][2];
            for (int i = 0; i < edgeList.size(); i++) {
                edges[i] = edgeList.get(i);
            }

            int m = Integer.parseInt(sc.nextLine().trim());

            Solution sol = new Solution();
            System.out.println(sol.graphColoring(V, edges, m) ? "true" : "false");
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    
    boolean isSafe(int node, ArrayList<ArrayList<Integer>> G, int[] colors, int col) {
    for (int it : G.get(node)) {
        if (colors[it] == col) return false;
    }
    return true;
    }
    
    boolean colorGraph(int node,ArrayList<ArrayList<Integer>> G ,int colors[],int m)
    {
        if(node==G.size())
        {
            return true;
        }
        
        for(int i=1;i<=m;i++)
        {
            if(isSafe(node,G,colors,i))
            {
                colors[node] = i;
                if(colorGraph(node+1,G,colors,m)) return true;
                colors[node] = 0;
            }
        }
        return false;
    }
    boolean graphColoring(int v, int[][] edges, int m) {
        // code here
        ArrayList<ArrayList<Integer>> G = convertGraph(v,edges);
        int n = edges.length;
        int colors[] = new int[v];
        if(colorGraph(0,G,colors,m))
        {
            return true;
        }
        return false;
        
    }
    
    ArrayList<ArrayList<Integer>> convertGraph(int v,int[][] edges)
    {
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    for (int i = 0; i < v; i++) {
        graph.add(new ArrayList<>());
    }

    for (int[] edge : edges) {
        int u = edge[0];
        int vtx = edge[1];
        
        // Undirected graph (add both ways)
        graph.get(u).add(vtx);
        graph.get(vtx).add(u);
    }
    return graph;
    }
}