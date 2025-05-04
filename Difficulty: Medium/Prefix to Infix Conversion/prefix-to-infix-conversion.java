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
            String ans = obj.preToInfix(s);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String preToInfix(String pre_exp) {
        // code here
        int n = pre_exp.length();
        String s = pre_exp;
        Stack<String> st = new Stack<>();
        int i = n - 1;
        while(i>=0)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                st.push(s.substring(i,i+1));
            }
            else
            {
                String top1 = st.pop();
                String top2 = st.pop();
                String newStr = '(' + top1 + s.charAt(i) + top2 + ')';
                st.push(newStr);
            }
            i--;
        }
        return st.peek();
    }
}
