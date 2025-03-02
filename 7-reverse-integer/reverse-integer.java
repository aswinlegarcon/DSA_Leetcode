class Solution {
    public int reverse(int x) {
        boolean positive = true;
        if(x<0)
        {
            positive = false;
        }
        String numAsString = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(numAsString);
        String reversedNum = sb.reverse().toString();
        try
        {
            int reverseNumber = Integer.parseInt(reversedNum);
            if(positive)
            {
                return reverseNumber;
            }
            return -reverseNumber;
        }
        catch(Exception e)
        {
            return 0;
        } 
    }
}