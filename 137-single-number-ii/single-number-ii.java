class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int cnt = 1;
        int num = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(num==nums[i])
            {
                cnt++;
            }
            else
            {
                if(cnt==3)
                {
                    cnt = 1;
                    num = nums[i];
                }
                else
                {
                    return num;
                }
            }
        }
        if(cnt==1) return nums[nums.length-1];
        return 0;

    }
}