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
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
        
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int n = nums.length;
        int result[] = new int[2]; 
        int left = 0;
        int right = n-1;
        while(left<=right)
        {
            int mid = (left+right) / 2;
            if(nums[mid] == target)
            {
                first = mid;
                right = mid-1;
            }
            else if(nums[mid] > target)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        left = 0;
        right = n-1;
        while(left<=right)
        {
            int mid = (left+right) / 2;
            if(nums[mid] == target)
            {
                last = mid;
                left = mid+1;
            }
            else if(nums[mid] > target)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        result[0] = first;
        result[1] = last;



        return result;
    }

    int countFreq(int[] arr, int target) {
        // code here
        int ans[] = new int[2];
        ans = searchRange(arr,target);
        if(ans[0] == -1) return 0;
        return ans[1] - ans[0] + 1; 
        
    }
}
