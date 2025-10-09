class Solution {
    public String triangleType(int[] nums) {
        if(nums[0]==nums[1] && nums[1]==nums[2]) return "equilateral";
        else
        {
            int side = nums[0]+nums[1];
            if(side<=nums[2]) return "none";
            side = nums[0] + nums[2];
            if(side <= nums[1]) return "none";
            side = nums[1] + nums[2];
            if(side <= nums[0]) return "none";
            if(nums[0]==nums[1] || nums[1]==nums[2] || nums[2] == nums[0])
            {
                return "isosceles";
            }
        }
        
        
        return "scalene";
    }
}