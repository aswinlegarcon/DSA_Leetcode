//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().inversionCount(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to count inversions in the array.


    static int mergeSort(int arr[], int l, int r) {
        // code here
        int count = 0;
        if(l==r)
        {
            return count;
        }
        
            int mid = (l + r) / 2;
            count += mergeSort(arr,l,mid);
            count += mergeSort(arr,mid+1,r);
            count += merge(arr,l,mid,r);
            return count;
        
    }
    
    static int merge(int arr[], int l, int mid, int r)
    {
        int count = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        int left = l;
        int right = mid+1;
        while(left <= mid && right <= r)
        {
            if(arr[left] <= arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else 
            {
                temp.add(arr[right]);
                count += (mid - left)+1;
                right++;
            }
        }
        
        // any array is exhausted add all remaining to final arraya as it is
        while(left <= mid)
        {
             temp.add(arr[left]);
            left++;

        }
        
        while(right <= r)
        {
            temp.add(arr[right]);
            right++;
        }
        
        for(int i=l;i<=r;i++)
        {
            arr[i] = temp.get(i-l);
        }
        return count;
        
        
    }
    
    static int inversionCount(int arr[]) {
        // Your Code Here
       int count = Solution.mergeSort(arr,0,arr.length-1);
       return count;
    }
}