class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> ans = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {

                if (gcd(i, j) == 1) {
                    ans.add(i + "/" + j);
                }
            }
        }

        return ans;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}