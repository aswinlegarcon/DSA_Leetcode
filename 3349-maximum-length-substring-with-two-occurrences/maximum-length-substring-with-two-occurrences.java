class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int[] hash = new int[26];
            for(int j=i;j<n;j++)
            {
                char c = s.charAt(j);
                hash[c-'a']++;
                boolean check = true;
                for(int k=0;k<26;k++)
                {
                    if(hash[k] > 2)
                    {
                        check = false;
                        break;
                    }
                }
                if(check) max = Math.max(j-i+1,max);
            }
        }
        return max;
    }
}