class Solution {
    public int search(int[] arr, int target) {
        int index = -1;
        int n = arr.length;
        int high = n-1;
        int low = 0;

        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == target) return mid;

            if(arr[low] <= arr[mid])
            {
                if(arr[low]<=target && target <= arr[mid])
                {
                    high = mid-1;
                }
                else
                {
                    low = mid+1;
                }
            }
            else
            {
                if(arr[mid] <= target && target <= arr[high])
                {
                    low = mid+1;
                }
                else
                {
                    high = mid-1;
                }
            }
        }
        return -1;

    }
}