class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int ind = 0;
        int n = nums.size();
        for(int i=0;i<n;i++)
        {
            if(ind!=0)
            {
                if(nums[ind-1]==nums[i]) continue;
                nums[ind] = nums[i];
            }
            ind++;
        }
        return ind;
    }
};