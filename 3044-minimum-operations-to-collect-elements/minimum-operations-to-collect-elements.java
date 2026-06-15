class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int n = nums.size();
        int cnt = 0;
        int[] occ = new int[k];
        for(int i=n-1;i>=0;i--)
        {
            int num = nums.get(i);
            if(num <= k)
            {
                occ[num-1]++;
            }
            cnt++;
            boolean check = true;
            for(int j=0;j<occ.length;j++)
            {
                if(occ[j] == 0)
                {
                    check = false;
                    break;
                }
            }
            if(check) return cnt;
        }
        return cnt;
    }
}