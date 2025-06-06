//{ Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.AllPrimeFactors(N);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution {
    public int[] AllPrimeFactors(int N) {
        // code here
        int[] result = new int[N];
        int index = 0;
        for(int i=2;i<=N;i++)
        {
            if(N%i==0)
            {
                result[index] = i;
                index += 1;
                while(N%i==0)
                {
                    N = N/i;
                }
            }
        }
        if(N>1) result[index] = N;
        
        return Arrays.copyOf(result, index);
    }
}