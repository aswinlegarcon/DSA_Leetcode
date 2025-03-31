//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int R = Integer.parseInt(read.readLine());
            int C = Integer.parseInt(read.readLine());
            int matrix[][] = new int[R][C];
            int c = 0;
            for (int i = 0; i < R; i++) {
                String line[] = read.readLine().trim().split(" ");
                for (int j = 0; j < C; j++) {
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int upperBound(int arr[],int x)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int up = n;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] > x)
            {
                up = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return up;
    }
    
    public int countCalc(int mat[][],int num)
    {
        int count = 0;
        for(int i=0;i<mat.length;i++)
        {
            count+= upperBound(mat[i],num);
        }
        return count;
    }
    
    int median(int mat[][]) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            low = Math.min(mat[i][0],low);
            high = Math.max(mat[i][m-1],high);
        }
        int req = (n*m)/2;
        while(low<=high)
        {
            int mid = (low+high) / 2;
            int count = countCalc(mat,mid);
            if(count <= req)
            {
                low = mid+1;
            }
            else
            {
               
                high = mid-1;
            }
        }
        return low;
        
    }
}