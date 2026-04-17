class Solution {
    public int minMirrorPairDistance(int[] nums) {
        
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
         for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                ans = Math.min(ans, i - map.get(nums[i]));
            }
            map.put(reverse(nums[i]), i);
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }

    private int reverse(int num)
    {
        int rev = 0;
        while(num>0)
        {
            int last = num%10;
            rev = rev * 10 + last;
            num = num/10;
        }
        return rev;
    }

}