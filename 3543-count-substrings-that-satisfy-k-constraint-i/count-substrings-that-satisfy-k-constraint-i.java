class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n = s.length();
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            int cnt0 = 0;
            int cnt1 = 0;
            for(int j=i;j<n;j++)
            {
                char c = s.charAt(j);
                if(c == '1') cnt1++;
                else cnt0++;
                if(cnt1 <=k || cnt0 <= k) ans++;
            }
        }
        return ans;
    }
}