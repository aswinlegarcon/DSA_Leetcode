class Solution {
    public boolean isPalindrome(int x) {
        String numAsString = String.valueOf(x);
        StringBuilder reverseNum = new StringBuilder(numAsString);
        if(numAsString.equals(reverseNum.reverse().toString()))
        {
            return true;
        }
        return false;
    }
}