class Solution {
    public int longestContinuousSubstring(String s) {
        int len = 1;
        int n = s.length();
        int max = 1;
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i-1)+1 == s.charAt(i))
            {
                len++;
                max = Math.max(len,max);
            }
            else
            {
                len = 1;
            }
        }
        return max;
    }
}