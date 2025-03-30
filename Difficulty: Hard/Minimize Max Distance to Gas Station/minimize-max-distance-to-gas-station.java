//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            Solution obj = new Solution();
            double ans = obj.findSmallestMaxDist(a, k);
            System.out.printf("%.2f", ans);
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java
class Pair
{
    double first;
    int second;
    
    public Pair(double first,int second)
    {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public static double findSmallestMaxDist(int stations[], int k) {
        // code here
        int n = stations.length;
        int places[] = new int[n-1];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Double.compare(b.first,a.first));
        for(int i =0;i<n-1;i++)
        {
            pq.add(new Pair(stations[i+1]-stations[i],i));
        }
        
        for(int gas = 1;gas<=k;gas++)
        {
            Pair tp = pq.poll();
            int index = tp.second;
            places[index]++;
            double diff = stations[index+1] - stations[index];
            double len = diff/(double)(places[index]+1);
            pq.add(new Pair(len,index));
        }
        return pq.peek().first;
    }
}
