class Solution {
    private void solve(List<String> ans, int n, String temp) {
        if (temp.length() == n) {
            ans.add(temp);
            return;
        }

        if (temp.isEmpty() || temp.charAt(temp.length() - 1) != '0')
            solve(ans, n, temp + "0");

        solve(ans, n, temp + "1");
    }

    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        solve(ans, n, "");
        return ans;
    }
}