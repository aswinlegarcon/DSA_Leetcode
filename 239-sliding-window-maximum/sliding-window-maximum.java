class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length];
        Deque<Integer> dq = new LinkedList<>();
        int index = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(!dq.isEmpty() && dq.getFirst() <= (i-k))
            {
                dq.removeFirst();
            }

            while(!dq.isEmpty() && nums[dq.getLast()] <= nums[i])
            {
                dq.removeLast();
            }

            dq.addLast(i);

            if(i>=k-1)
            {
                result[index] = nums[dq.getFirst()];
                index++;
            }
        }
        return Arrays.copyOf(result,index);
    }
}