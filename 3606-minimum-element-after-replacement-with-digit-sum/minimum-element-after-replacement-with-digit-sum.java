class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum = getSum(nums[i]);
            min = Math.min(sum,min);
        }
        return min;
    }

    private int getSum(int n)
    {
        int sum = 0;
        while(n>0)
        {
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}