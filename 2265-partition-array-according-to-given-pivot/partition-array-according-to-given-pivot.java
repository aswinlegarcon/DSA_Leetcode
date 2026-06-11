class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n-1;
        int i = 0;
        int j = n-1;
        while(i < n)
        {
            if(nums[i] < pivot)
            {
                result[left] = nums[i];
                left++;
            }
            if(nums[j] > pivot)
            {
                result[right] = nums[j];
                right--;
            }
            i++;
            j--;
        }

        while(left<=right)
        {
            result[left] = pivot;
            result[right] = pivot;
            left++;
            right--;
        }



    return result;
    }
}