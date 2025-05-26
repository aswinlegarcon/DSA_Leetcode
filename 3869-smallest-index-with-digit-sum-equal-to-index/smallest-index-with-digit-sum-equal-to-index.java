class Solution {
    public int smallestIndex(int[] nums) {
        int index = -1;
        for(int i=0;i<nums.length;i++)
        {
            int temp = nums[i];
            int sum = 0;
            while(temp>0)
            {
                sum += temp%10;
                temp = temp/10;
            }
            if(i==sum)
            {
                index = i;
                break;
            }
        }
        return index;
    }
}