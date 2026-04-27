class Solution {
    public int balancedStringSplit(String s) {
        int cnt = 0;
        int n = s.length();
        
        int temp = 0;
        for(int j=0;j<n;j++)
        {
            char c = s.charAt(j);
            if(c=='L')
            {
                temp--;
            }
            else if(c=='R')
            {
                temp++;
            }
            if(temp==0) cnt++;
        }
         
        return cnt;
    }
}