class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean odd = true?nums[0]%2==1:false;
        for(int i=1;i<nums.length;i++)
        {
            if((!odd && nums[i] % 2 == 0) || (odd && nums[i] % 2 == 1)) return false;
            odd = true?nums[i]%2==1:false;
        }
        return true;
    }
}