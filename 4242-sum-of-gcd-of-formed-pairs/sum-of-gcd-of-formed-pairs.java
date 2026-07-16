class Solution {
    private int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }

    public long gcdSum(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            arr[i] = gcd(arr[i], max);
        }

        Arrays.sort(arr);

        long res = 0;        
        for (int i = 0, j = arr.length - 1; i < j; i++, j--)
            res += gcd(arr[i], arr[j]);

        return res;
    }
}