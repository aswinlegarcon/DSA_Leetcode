class Solution {
    public int majorityElement(int[] nums) {
        int number = 0;
        int count = 0;
        // to find which number is greater occuring than other number
        for(int i=0;i<nums.length;i++)
        {
            if(count == 0)
            {
                number = nums[i];
                count = 1;
            }
            else if(nums[i] == number)
            {
                count++;
            }
            else
            {
                count--;
            }
        }

        // To check that number is occuring more than n/2 times
        // int result = 0;
        // for(int i=0; i<nums.length;i++)
        // {
        //     if(nums[i] == number)
        //     {
        //         result++;
        //     }
        // }
        // if(result > nums.length/2)
        // {
        //     return number;
        // }
        // return -1;
        return number;
    }
}