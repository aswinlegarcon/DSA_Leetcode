class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        int n = nums.length;
        int m = l.length;
        for(int i=0;i<m;i++)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=l[i];j<=r[i];j++)
            {
                temp.add(nums[j]);
            }
            Collections.sort(temp);
            int diff = temp.get(1) - temp.get(0);
            boolean check = true;
            for(int j=2;j<temp.size();j++)
            {
                if(temp.get(j)-temp.get(j-1)!=diff)
                {
                    check = false;
                    break;
                }
            }
            ans.add(check);
        }
        return ans;
    }
}