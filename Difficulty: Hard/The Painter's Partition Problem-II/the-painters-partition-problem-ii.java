//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String input_line[] = read.readLine().trim().split("\\s+");
            int n = input_line.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(input_line[i]);
            int k = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.minTime(arr, k));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
    public static int cntTime(int arr[],int boards)
    {
        int painters = 1;
        long time = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] + time <= boards)
            {
                time += arr[i];
            }
            else
            {
                painters++;
                time = arr[i];
            }
        }
        return painters;
    }
 

    public int minTime(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
            max = Math.max(max,arr[i]);
        }
        int low = max;
        int high = sum;
        int ans = -1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            int cnt = cntTime(arr,mid);
            if(cnt > k)
            {
                low = mid+1;
            }
            else
            {
                ans = mid;
                high = mid - 1;
            }
            
        }
        return ans;
    }
}
