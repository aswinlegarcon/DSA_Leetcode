class Solution {
    public int myAtoi(String st) {
        
        long result = 0;
        boolean negative = false;
        boolean plus = false;
        String s = st.trim();
        int n = s.length();
        if(s.length()==0) return 0;
        if(s.charAt(0)=='-')
        {
            negative = true;
        }
        else if(s.charAt(0)=='+')
        {
            plus = true;
        }
        System.out.println(negative);
        if(negative || plus)
        {
            for(int i=1;i<s.length();i++) 
            {
                if(!Character.isDigit(s.charAt(i))) return negative ? (int) -result : (int) result;
                int digit = s.charAt(i) - '0'; // finding that digit by difference in ASCII
                result = result * 10 + digit;

                // Check for overflow
                if (!negative && result > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (negative && -result < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            }
        }
        else
        {
            for(int i=0;i<s.length();i++) 
            {
                if(!Character.isDigit(s.charAt(i))) return negative ? (int) -result : (int) result;
                int digit = s.charAt(i) - '0'; // finding that digit by difference in ASCII
                result = result * 10 + digit;

                // Check for overflow
                if (!negative && result > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (negative && -result < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            }
        }
        

        if(negative)
        {
            return -(int)result;
        }
        return (int)result;
    }
}
