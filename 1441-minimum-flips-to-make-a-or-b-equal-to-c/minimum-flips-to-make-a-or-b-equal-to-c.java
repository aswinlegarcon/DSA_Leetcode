class Solution {
    public int minFlips(int a, int b, int c) {
        int result = (a | b) ^ c;
        return Integer.bitCount(result) + Integer.bitCount((a & b) & result);
    }
}