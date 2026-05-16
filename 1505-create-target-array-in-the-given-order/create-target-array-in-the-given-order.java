class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ans.add(index[i],nums[i]);
        }

        int target[] = new int[n];
        for(int i=0;i<n;i++)
        {
            target[i] = ans.get(i);
        }
        return target;
    }
}