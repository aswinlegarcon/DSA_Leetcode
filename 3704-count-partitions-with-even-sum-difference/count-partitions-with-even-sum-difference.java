class Solution {
    public int countPartitions(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        int[] arr = new int[n];
        arr[0] = nums[0];
        for(int i=1;i<n;i++)
        {
            arr[i] = arr[i-1] + nums[i];
        }
        for(int i=0;i<n-1;i++)
        {
            int sumLeft = arr[i];
            int sumRight = arr[n-1] - arr[i];
            int diff = sumLeft - sumRight;
            if(diff%2==0) cnt++;
        }
        return cnt;
    }
}