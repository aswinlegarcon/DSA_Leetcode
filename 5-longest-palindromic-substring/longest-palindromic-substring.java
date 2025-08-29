class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        String result = "";
        int l = 0;
        int r = 0;
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<=s.length();j++)
            {
                String sub = s.substring(i,j);
                if(checkPal(sub))
                {
                    if(sub.length() > maxLen)
                    {
                        maxLen = sub.length();
                        result = sub;
                    }
                }
            }
        }

        return result;
    }

    private boolean checkPal(String s)
    {
        int n = s.length();
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        }
        return true;
    }
}