class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int i = 0;
        return helpPalindrome(result,i);
    }

    public boolean helpPalindrome(String s,int start)
    {
        if(start>=s.length()/2)
        {
            return true;
        }
        if(s.charAt(start)!=s.charAt(s.length()-start-1))
        {
            return false;
        }
        return helpPalindrome(s,start+1);
    }
}