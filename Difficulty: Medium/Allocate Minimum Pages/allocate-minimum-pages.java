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
            int ans = sln.findPages(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends



//Back-end complete function Template for Java

class Solution {
    public static int cntPage(int arr[],int pages)
    {
        int student = 1;
        int pageHold = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] + pageHold <= pages)
            {
                pageHold += arr[i];
            }
            else
            {
                student++;
                pageHold = arr[i];
            }
        }
        return student;
    }
    public static int findPages(int[] arr, int k) 
    {
        // code here
        int n = arr.length;
        if(k>n)
        {
            return -1;
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
            max = Math.max(max,arr[i]);
        }
        int low = max;
        int high = sum;
        while(low<=high)
        {
            int mid = (low+high)/2;
            int cnt = cntPage(arr,mid);
            if(cnt > k)
            {
                low = mid+1;
            }
            else
            {
                high = mid - 1;
            }
            
        }
        return low;
    }
}