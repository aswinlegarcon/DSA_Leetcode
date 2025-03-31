class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder(num);
        while(sb.length()>0)
        {
            
            if((int)sb.charAt(sb.length()-1) % 2 == 1)
            {
                return sb.toString();
            }
            else
            {
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return "";
    }
}