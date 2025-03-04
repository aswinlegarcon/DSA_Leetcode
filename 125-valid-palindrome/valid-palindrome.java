class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int i = 0;
        int n = result.length()-1;
        return helpPalindrome(result,i,n);
    }

    public boolean helpPalindrome(String s,int start,int end)
    {
        if(start>=end)
        {
            return true;
        }
        if(s.charAt(start)!=s.charAt(end))
        {
            return false;
        }
         return helpPalindrome(s,start+1,end-1);
    }
}