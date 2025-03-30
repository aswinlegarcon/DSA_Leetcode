//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine().trim());

            String[] line1 = br.readLine().trim().split(" ");
            int[] a = new int[line1.length];
            for (int i = 0; i < line1.length; i++) {
                a[i] = Integer.parseInt(line1[i]);
            }

            String[] line2 = br.readLine().trim().split(" ");
            int[] b = new int[line2.length];
            for (int i = 0; i < line2.length; i++) {
                b[i] = Integer.parseInt(line2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.kthElement(a, b, k));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int kthElement(int nums1[], int nums2[], int k) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+n2;
        if(n1 > n2) return kthElement(nums2,nums1,k); // first arrays make as smaller
        int low = Math.max(0,k-n2);
        int high = Math.min(k,n1);
        int left = k;
        while(low<=high)
        {
            int mid1 = (low+high)/2;
            int mid2 = left - mid1;
            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;
            if(mid1>0)
            {
                l1 = nums1[mid1-1];
            }
            if(mid2>0) l2 = nums2[mid2-1];
            if(mid1<n1) r1 = nums1[mid1];
            if(mid2<n2) r2 = nums2[mid2];

            if(l1 <= r2 && l2 <= r1)
            {
                return Math.max(l1,l2);
            }
            else if(l1 > r2)
            {
                high = mid1-1;
            }
            else
            {
                low = mid1+1;
            }

        }
        return 0;

    }
}