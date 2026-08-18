class Solution {
    public int findTheLongestSubstring(String s) {
        int[] hash = new int[32];
        Arrays.fill(hash, -2);
        hash[0] = -1;

        int maxLen = 0;
        int mask = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            switch (ch) {
                case 'a':
                    mask ^= 1;
                    break;
                case 'e':
                    mask ^= 2;
                    break;
                case 'i':
                    mask ^= 4;
                    break;
                case 'o':
                    mask ^= 8;
                    break;
                case 'u':
                    mask ^= 16;
                    break;
            }

            int prev = hash[mask];
            if (prev == -2) {
                hash[mask] = i;
            } else {
                maxLen = Math.max(maxLen, i - prev);
            }
        }

        return maxLen;
    }
}