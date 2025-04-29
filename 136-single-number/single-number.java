class Solution {
    public int singleNumber(int[] nums) {
        int XOR = 0;
        for(int num:nums)
        {
            XOR = XOR ^ num; // do ^ on all numbers will cancel the repeating numbers and remain with the single number
        }
        return XOR;
}
}