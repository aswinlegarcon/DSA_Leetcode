class Solution {
    public String rankTeams(String[] votes) {

        int m = votes[0].length();

        int[][] count = new int[26][m];

        for (String vote : votes) {
            for (int i = 0; i < m; i++) {
                char c = vote.charAt(i);
                count[c - 'A'][i]++;
            }
        }

        Character[] teams = new Character[m];

        for (int i = 0; i < m; i++) {
            teams[i] = votes[0].charAt(i);
        }

        Arrays.sort(teams, (a, b) -> {

            for (int i = 0; i < m; i++) {
                if (count[a - 'A'][i] != count[b - 'A'][i]) {
                    return count[b - 'A'][i] - count[a - 'A'][i];
                }
            }

            return a - b;
        });

        StringBuilder sb = new StringBuilder();

        for (char c : teams)
        {
            sb.append(c);
        }

        return sb.toString();
    }
}