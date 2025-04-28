//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int i = sc.nextInt();

            Solution obj = new Solution();
            obj.bitManipulation(n, i);
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static void bitManipulation(int num, int i) {
        int num1;
        int val = 1 << (i - 1);
        
        if ((num & val) != 0) {
            num1 = 1;
        } else {
            num1 = 0;
        }
        
        int num2 = num | (1 << (i - 1));
        int num3 = num & (~(1 << (i - 1)));
        
        System.out.print(num1 + " " + num2 + " " + num3);
    }
}
