class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int maxFreq = 0;
        int freq[] = new int[26];
        while(r<n)
        {
            char c = s.charAt(r);
            freq[c-'A']++;
            maxFreq = Math.max(maxFreq,freq[c-'A']);
            if((r-l+1-maxFreq) > k)
            {
                freq[s.charAt(l)-'A']--;
                l++;
            }

            if((r-l+1-maxFreq) <= k)
            {
                maxLen = Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}