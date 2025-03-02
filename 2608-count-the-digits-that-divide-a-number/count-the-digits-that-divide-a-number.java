class Solution {
    public int countDigits(int num) {
        int count = 0;
        int numToCheck = num;
        while(num>0)
        {
            int reminder = num % 10;
            if(numToCheck%reminder == 0)
            {
                count++;
            }
            num = num/10;
        }
        return count;
        
    }
}