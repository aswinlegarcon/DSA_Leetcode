class Solution {
    public boolean possible(int arr[],int day,int m,int k)
    {
        int count = 0;
        int noOfB = 0;
        for(int num:arr)
        {
            if(num <= day)
            {
                count++;
            }
            else
            {
                noOfB += (count/k);
                count = 0;
            }
        }
        noOfB += (count/k);
        return noOfB >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) 
    {
        int n = bloomDay.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num:bloomDay)
        {
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        int low = min;
        int high = max;
        int ans = -1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(possible(bloomDay,mid,m,k))
            {
                ans = mid;
                high = mid -1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
        
    }
}