class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int dSum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            int num = nums[i];
            while(num>0)
            {
                int rem = num%10;
                dSum += rem;
                num = num/10;
            }
        }

        return Math.abs(sum-dSum);
    }
}