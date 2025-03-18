class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int longer = 1;
        HashSet<Integer> num = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            num.add(nums[i]);
        }

        for(int n:num)
        {
            if(!num.contains(n-1))
            {
                int x = n;
                int count = 1;
                while(num.contains(x+1))
                {
                    x = x+1;
                    count = count +1;
                }
                longer = Math.max(longer,count);
            }
        }
        return longer;
    }
}