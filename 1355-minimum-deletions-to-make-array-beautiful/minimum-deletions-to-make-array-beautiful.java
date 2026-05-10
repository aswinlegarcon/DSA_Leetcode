class Solution {
    public int minDeletion(int[] nums) {
        int n = nums.length;
        if(n==1) return 1;
        ArrayList<Integer> lst = new ArrayList<>();
        int cnt = 0;
        for(int num:nums)
        {
            int size = lst.size();

            if(size % 2 == 0 || lst.get(size-1) != num)
            {
                lst.add(num);
            }
            else
            {
                cnt++;
            }
        }

        if(lst.size() % 2 != 0) cnt ++;
        return cnt;
    }
}