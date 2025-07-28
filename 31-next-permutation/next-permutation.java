class Solution {
    public void reverse(int[] arr,int start,int end)
    {
        while(start<=end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakP = -1;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]<nums[i+1]) breakP = i;
        }
        if(breakP==-1)
        {
            reverse(nums,0,n-1);
            return;
        }
        // find least greater
        for(int i=n-1;i>=breakP;i--)
        {
            if(nums[i]>nums[breakP])
            {
                int temp = nums[i];
                nums[i] = nums[breakP];
                nums[breakP] = temp;
                break;
            }
        }
        reverse(nums,breakP+1,n-1);

    }
}