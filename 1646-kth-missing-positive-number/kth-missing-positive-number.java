class Solution {
   
    public int findKthPositive(int[] arr, int k)
    {
        
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = (low + high)/2;
            int missing = arr[mid] - (mid+1);
            if(missing<k)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        // int missingAtHigh = arr[high] - (high+1);
        // int ans = arr[high] + (k-missingAtHigh); --- arr[high] + k - (arr[high] - high - 1) 
        // arr[high] + k - arr[high] + high + 1 --  (- & +)arr[high] striked out
        // k + high + 1;
        
        return k + high + 1;
    }
}