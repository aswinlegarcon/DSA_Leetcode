class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int current = nums[0];
        int j =0;
        for(int i =1;i<nums.length;i++)
        {
           if(nums[j] != nums[i])
           {
              nums[j+1] = nums[i];
              j++;
              count++;
           }

        }
        return count;
    }
}