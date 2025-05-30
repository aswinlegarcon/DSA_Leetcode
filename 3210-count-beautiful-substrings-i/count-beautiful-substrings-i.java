class Solution {
    public int beautifulSubstrings(String s, int k) {
        int cnt = 0;
        int n = s.length();
       
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        
        for(int i=0;i<n;i++)
        {
            int vowCnt = 0;
            int csnCnt = 0;
            for(int j=i;j<n;j++)
            {
                char c = s.charAt(j);
                if(set.contains(c)) vowCnt++;
                else csnCnt++;
                if(vowCnt==csnCnt && (vowCnt*csnCnt)%k==0) cnt++;
            }
        }
        return cnt;
        }
    }
