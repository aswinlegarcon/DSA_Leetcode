class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int hash[] = new int[46]; // largest num is 99999 = 45
        int max = 0;
        
        for(int i=lowLimit;i<=highLimit;i++)
        {
            int sum = getSum(i);
            hash[sum]++;
            max = Math.max(max,hash[sum]);
        }

        return max;
    }

    private int getSum(int num)
    {
        int sum = 0;
        while(num>0)
        {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}