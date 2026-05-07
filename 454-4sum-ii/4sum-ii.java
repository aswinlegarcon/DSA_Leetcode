class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int cnt = 0;
        int n = nums1.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int k : nums3)
        {
            for(int l : nums4)
            {
                map.put(k+l,map.getOrDefault(k+l,0)+1);
            }
        }
        
        for(int i : nums1)
        {
            for(int j : nums2)
            {
                cnt += map.getOrDefault(-(i+j),0);
            }
        }

        return cnt;
    }
}