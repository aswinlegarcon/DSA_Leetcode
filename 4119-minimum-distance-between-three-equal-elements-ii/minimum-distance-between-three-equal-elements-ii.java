import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int min = Integer.MAX_VALUE;

        for (List<Integer> lst : map.values()) {
            int m = lst.size();

            if (m >= 3) {
                for (int i = 0; i < m - 2; i++) {
                    int a = lst.get(i);
                    int b = lst.get(i + 1);
                    int c = lst.get(i + 2);

                    int diff = 2 * (c - a);
                    min = Math.min(min, diff);
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}