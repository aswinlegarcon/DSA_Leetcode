class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> seen = new ArrayList<>();
        int k = 0;
        int i = 0;
        int n = nums.length;
        while(i<n)
        {
            if(nums[i]>0)
            {
                seen.add(0,nums[i]);
                k=0;
            }
            else
            {
                k++;
                if(k<=seen.size())
                {
                    ans.add(seen.get(k-1));
                }
                else
                {
                    ans.add(-1);
                }
            }
            i++;
        }
        return ans;

    }
}