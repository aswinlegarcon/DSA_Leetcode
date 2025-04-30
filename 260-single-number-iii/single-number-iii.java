class Solution {
    public int[] singleNumber(int[] nums) {
        long XOR = 0;
        for(int i=0;i<nums.length;i++)
        {
            XOR = XOR ^ nums[i];
        }
        long rightmost = (XOR & (XOR-1)) ^ XOR; // gets the rightmost set bit
        int b1 = 0;
        int b2 = 0;
        int result[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i] & rightmost) == 0)
            {
                b1 = b1 ^ nums[i];
            }
            else 
            {
                b2 = b2 ^ nums[i];
            }
        }
        result[0] = b1;
        result[1] = b2;
        return result;
    }
}