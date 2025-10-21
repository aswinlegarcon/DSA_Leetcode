class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String temp:operations)
        {
            if(temp.charAt(0)=='-' || temp.charAt(temp.length()-1)=='-')
            {
                x--;
            }
            else if(temp.charAt(0)=='+' || temp.charAt(temp.length()-1)=='+')
            {
                x++;
            }
            
        }
        return x;
    }
}