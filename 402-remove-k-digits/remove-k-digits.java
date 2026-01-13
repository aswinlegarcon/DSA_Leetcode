class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<num.length();i++)
        {
            while(!st.empty() && k > 0 && (st.peek()-'0') > 
            (num.charAt(i) - '0') )
            {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        if(k>0)
        {
            while(k>0)
            {
                st.pop();
                k--;
            }
        }
        if(st.empty()) return "0";
        StringBuilder sb = new StringBuilder();
        while(!st.empty())
        {
            sb.append(st.peek());
            st.pop();
        }
        while(sb.length()!=0 && sb.charAt(sb.length()-1)=='0')
        {
            sb.deleteCharAt(sb.length()-1);
        }
        if(sb.length()==0) return "0";

        return sb.reverse().toString();   
    }
}