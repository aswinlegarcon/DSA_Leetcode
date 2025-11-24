class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> lst = new ArrayList<>();
        int sum = 0;
        for(int i:nums)
        {
            sum = ((sum*2) + i) % 5;
            lst.add(sum==0);
        }
        return lst;
    }
}