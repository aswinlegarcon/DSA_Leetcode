class Solution {
    public int minimumMoves(String s) {
        int steps = 0;
        int i = 0;
        int n = s.length();

        while (i < n) {
            if (s.charAt(i) == 'X') {
                steps++;
                i += 3;
            } else {
                i++;
            }
        }

        return steps;
    }
}