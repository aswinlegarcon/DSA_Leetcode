class Solution {

    public int[] separateDigits(int[] nums) {

        ArrayList<Integer> lst = new ArrayList<>();
        int ind = 0;
        for(int num : nums)
        {
            int cnt = 0;
            while(num>0)
            {
                int rem = num%10;
                lst.add(ind,rem);
                num = num/10;
                cnt++;
            }
            ind += cnt;
        }
        int ans[] = new int[lst.size()];
        for(int i=0;i<lst.size();i++)
        {
            ans[i] = lst.get(i);
        }
        return ans;
        
    }

}