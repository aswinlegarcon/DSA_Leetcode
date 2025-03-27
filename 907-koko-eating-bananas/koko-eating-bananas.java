class Solution {
    public int maxElement(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int num:arr)
        {
            max = Math.max(max,num);
        }
        return max;
    }
    public int hours(int arr[],int mid)
    {
        int total = 0;
        for(int num:arr)
        {
            total += Math.ceil((double)num / (double)mid); // 3 bananas / 3 bananas per hour  -- so it takes 1 hour
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h)
    {
        int low = 1;
        int high = maxElement(piles);
        int ans = 0;
        while(low<=high)
        {
            int mid = (low+high) / 2;
            int totalHRS = hours(piles,mid);
            
            if(totalHRS <= h)
            {
                ans = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }
}