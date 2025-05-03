//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(new Solution().infixToPostfix(br.readLine().trim()));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public static int priority(char c)
    {
        if(c=='^') return 3;
        else if(c=='*' || c=='/') return 2;
        else if(c=='+' || c=='-') return 1;
        else return -1;
    }
    public static String infixToPostfix(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        int i = 0;
        String ans = "";
        while(i<s.length())
        {
            if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z') ||
            (s.charAt(i)>='0' && s.charAt(i)<='9')) // for hangling operands
            {
                ans+=s.charAt(i);
            }
            else if(s.charAt(i)=='(')// open braces
            {
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')')// closing braces
            {
                while(!st.empty()  && st.peek()!='(')
                {
                    ans += st.peek();
                    st.pop();
                }
                st.pop(); // for popping open braces
            }
            else // for handling operators
            {
                while(!st.empty() && (priority(s.charAt(i))) <= priority(st.peek()) )
                {
                    ans += st.peek();
                    st.pop();
                }
                st.push(s.charAt(i));
            }
            i++;
        }
        while(!st.empty())
        {
            ans += st.peek();
            st.pop();
        }
        return ans;
    }
}