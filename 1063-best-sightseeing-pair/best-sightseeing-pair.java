class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int res = 0;
        int cur = 0;
        for (int val: values) {
            res = Math.max(res, cur + val);
            cur = Math.max(cur, val) - 1;
        }
        return res;
    }
}