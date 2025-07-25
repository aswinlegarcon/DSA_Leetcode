class Solution {
    public int maxSum(int[] nums) {
        ArrayList<Integer> uniq = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums)
        {
            if(num<0) continue;
            if(set.contains(num)) continue;
            else
            {
                set.add(num);
                uniq.add(num);
            }
        }
        if(uniq.size()==0)
        {
            int ans = Integer.MIN_VALUE;
            for(int num:nums)
            {
                ans = Math.max(ans,num);
            } 
            return ans;
        }
        int max = 0;
        for(int num:uniq)
        {
            max += num;
        }
        return max;
    }
}