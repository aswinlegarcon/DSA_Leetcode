class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n-k+1];
        int ind = 0;
        int resInd = 0;
        while(ind<=n-k)
        {
            if(isSortedAndConsecutive(nums,ind,k))
            {
                result[resInd] = nums[ind+k-1];
            }
            else
            {
                result[resInd] = -1;
            }
            ind++;
            resInd++;
        }
        return result;

    }

    private boolean isSortedAndConsecutive(int[] nums,int ind,int k)
    {
        for(int i=ind+1;i<ind+k;i++)
        {
            if(nums[i-1] >= nums[i]) return false;
        }
        
        for(int i=ind;i<ind+k-1;i++)
        {
            if(nums[i]+1 != nums[i+1]) return false;
        }

        return true;
    }
    
}