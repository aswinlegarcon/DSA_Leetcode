//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.aggressiveCows(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public static boolean canPlace(int arr[],int dist,int cows)
    {
        int count = 1;
        int lastCow = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] - lastCow >= dist)
            {
                count++;
                lastCow = arr[i];
            }
        }
        return count >= cows;
    }
    public static int aggressiveCows(int[] stalls, int k) 
    {
        Arrays.sort(stalls);
        int n = stalls.length;
        int low = 1;
        int high = stalls[n-1] - stalls[0];
        int ans = 0;
        while(low<=high)
        {
            int mid = (low+high) /2;
            if(canPlace(stalls,mid,k))
            {
                ans = mid;
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return ans;
        
        
    }
}