//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            Solution ob = new Solution();
            List<Integer> ans = ob.get(a,b);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static List<Integer> get(int a, int b) {
        // code here
        a = a ^ b;
        b = a ^ b; // (a^b)^b b,b strike out (ans = a)
        a = a ^ b; // (a^b)^b(a) b can be written as a :: (a^b)^a = a,a strike out (ans = b);
        return new ArrayList<>(Arrays.asList(a,b));
// swap done;
        
    }
}