class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index = i;
                break;
            }
        }
        if(index==-1)
        {
            reverse(0,nums.length-1,nums);
            return;
        }

        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i] > nums[index])
            {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                reverse(index+1,nums.length-1,nums);
                return;
            }
        }
    }

    public void reverse(int l,int r,int[] arr)
    {
        while(l<r)
        {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}