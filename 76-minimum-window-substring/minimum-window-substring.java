class Solution {
    public String minWindow(String s, String t) {
        int[] hash = new int[128];
        int m = t.length();
        int n = s.length();

        for(int i=0;i<m;i++)
        {
            hash[t.charAt(i)]++;
        }

        int l = 0;
        int r = 0;
        int cnt = 0;
        int minLen = Integer.MAX_VALUE;
        int index = -1;
        while(r<n)
        {
            if(hash[s.charAt(r)]>0)
            {
                cnt = cnt + 1;
            }
            hash[s.charAt(r)]--;
            while(cnt==m)
            {
                if(r-l+1 < minLen)
                {
                    minLen = r-l+1;
                    index = l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0)
                {
                    cnt = cnt - 1;
                }
                l++;
            }
            r++;
        }
        if(index==-1)
        {
            return "";
        }
        return s.substring(index,index+minLen);
        
    }
}