class Solution {
    public int beautifulSubstrings(String s, int k) {
        int cnt = 0;
        int n = s.length();    
        for(int i=0;i<n;i++)
        {
            int vowCnt = 0;
            int csnCnt = 0;
            for(int j=i;j<n;j++)
            {
                char c = s.charAt(j);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') vowCnt++;
                else csnCnt++;
                if(vowCnt==csnCnt && (vowCnt*csnCnt)%k==0) cnt++;
            }
        }
        return cnt;
        }
    }
