class Solution {
    public boolean wordBreak(String s, List<String> wordDict)
    {
        HashSet<String> set = new HashSet<>(wordDict);
        int maxLen = Integer.MIN_VALUE;
        for(String word:wordDict)
        {
            maxLen = Math.max(maxLen,word.length()); // get the max len of a word in dict for future use
        }

        int n = s.length();
        boolean[] dp = new boolean[n+1]; // substring 0 - n so we need arraysize 1 more than n

        dp[0] = true; // 0th index = "" which is a valid one always
        for(int i=1;i<=n;i++) // goes till n as the substring gets before index only
        {
            for(int j=i-1;j >= Math.max(0,i-maxLen); j--) // i-1 to 0 or maximnum length in the dict
            {
                if(dp[j] && set.contains(s.substring(j,i)))
                {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[n]; // if the last index's substring is valid one then the whole string will be valid

        
    }
}