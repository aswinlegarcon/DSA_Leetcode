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
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.postToInfix(s);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        // code here
        Stack<String> st = new Stack<>();
        int i = 0;
        while(i<exp.length())
        {
            if(Character.isLetterOrDigit(exp.charAt(i)))
            {
                st.push(exp.substring(i,i+1));
            }
            else
            {
                String t1 = st.pop();
                String t2 = st.pop();
                String newStr = '(' + t2 + exp.substring(i,i+1) + t1 + ')';
                st.push(newStr);
            }
            i++;
        }
        return st.peek();
    }
}
