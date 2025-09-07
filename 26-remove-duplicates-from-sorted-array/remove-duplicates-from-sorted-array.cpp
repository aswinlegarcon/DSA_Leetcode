class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        nums.push_back(105);
        int n = nums.size();
        vector<int> arr;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]==nums[i+1]) continue;
            else arr.push_back(nums[i]);
        }

        for(int i=0;i<arr.size();i++)
        {
            nums[i] = arr[i];
        }
        return arr.size();
    }
};