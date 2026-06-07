class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            return b-a;
        });

        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            pq.add(nums[i]);
        }

        for(int i=1;i<k;i++)
        {
            int ele = pq.poll();
        }
        return pq.poll();

    }
}