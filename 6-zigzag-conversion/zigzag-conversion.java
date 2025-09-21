class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        ArrayList<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) rows.add(new StringBuilder());

        int ind = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(ind).append(c);
            if (ind == 0 || ind == numRows - 1) goingDown = !goingDown;
            ind += goingDown ? 1 : -1;
        }

        StringBuilder ans = new StringBuilder();
        for (StringBuilder row : rows) ans.append(row);
        return ans.toString();
    }
}
