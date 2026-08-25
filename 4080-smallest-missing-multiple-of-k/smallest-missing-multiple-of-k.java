class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        boolean[] hash = new boolean[101];

        for(int num:nums)
        {
            hash[num] = true;
        }
        int i = k;
        for(i=k;i<=100;i+=k)
        {
            if(!hash[i]) return i;
        }
        return i;
    }
}