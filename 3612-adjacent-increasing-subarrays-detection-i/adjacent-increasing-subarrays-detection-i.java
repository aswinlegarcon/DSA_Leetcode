class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();

        for(int i=0;i<=n-(k*2);i++)
        {
            if(checkArrays(i,i+k,k,nums)) return true;
        }

        return false;
    }

    private boolean checkArrays(int a,int b,int k,List<Integer> nums)
    {
        for(int i=a+1;i<a+k;i++)
        {
            if(nums.get(i-1)>=nums.get(i)) return false;
        }

        for(int i=b+1;i<b+k;i++)
        {
            if(nums.get(i-1)>=nums.get(i)) return false;
        }

        return true;
    }
}