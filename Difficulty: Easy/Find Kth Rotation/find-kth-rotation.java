//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int n = arr.size();
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        int low = 0;
        int high = n-1;
        
        while(low<=high)
        {
            int mid = (low+high) /2;
            if(arr.get(mid) >= arr.get(low))
            {
                if(arr.get(low) < min)
                {
                    min = arr.get(low);
                    minIndex = low;
                }
                low = mid+1;
            }
            else
            {
                if(arr.get(mid) < min)
                {
                    min = arr.get(mid);
                    minIndex = mid;
                }
                high = mid-1;
            }
        }
        return minIndex;
    }
}