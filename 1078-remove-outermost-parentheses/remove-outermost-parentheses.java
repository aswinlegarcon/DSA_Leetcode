class Solution {
    public String removeOuterParentheses(String s) 
    {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                if(count > 0) sb.append('(');
                count++;
            }
            else if(s.charAt(i) == ')')
            {
                count--;
                if(count > 0) sb.append(')');
            }
        }
        return sb.toString();
        
        
    }
}