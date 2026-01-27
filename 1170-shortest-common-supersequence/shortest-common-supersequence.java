class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n][m];
        for(int[] arr:dp)
        {
            Arrays.fill(arr,-1);
        }
        getLCS(n-1,m-1,str1,str2,dp);
        StringBuilder ans = new StringBuilder();
        int i = n-1;
        int j = m-1;
        while (i >= 0 && j >= 0) 
        {
            if (str1.charAt(i) == str2.charAt(j)) {
                ans.append(str1.charAt(i));
                i--;
                j--;
            }
            else if (i == 0) {
                ans.append(str2.charAt(j));
                j--;
            }
            else if (j == 0) {
                ans.append(str1.charAt(i));
                i--;
            }
            else if (dp[i-1][j] > dp[i][j-1]) {
                ans.append(str1.charAt(i));
                i--;
            }
            else {
                ans.append(str2.charAt(j));
                j--;
            }
        }
        while(i>=0)
        {
            ans.append(str1.charAt(i));
            i--;
        }
        while(j>=0)
        {
            ans.append(str2.charAt(j));
            j--;
        }

        return ans.reverse().toString();

    }


    private int getLCS(int i,int j,String word1, String word2,int dp[][])
    {
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        if(word1.charAt(i) == word2.charAt(j))
        return dp[i][j] = 1 + getLCS(i-1,j-1,word1,word2,dp);

        dp[i][j] = Math.max(
            getLCS(i-1,j,word1,word2,dp), getLCS(i,j-1,word1,word2,dp));
        return dp[i][j];
    }
}
