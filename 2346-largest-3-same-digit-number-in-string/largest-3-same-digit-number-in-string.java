class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        char maxNum = 0;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n-2;i++)
        {
            char c = num.charAt(i);
            char c2 = num.charAt(i+1);
            char c3 = num.charAt(i+2);
            if(c == c2 && c2 == c3)
            {
                if(c>maxNum) 
                {
                    maxNum = c;
                    ans = new StringBuilder();
                    ans.append(c);
                    ans.append(c2);
                    ans.append(c3);
                }
            }
        }
        return ans.toString();
    }
}