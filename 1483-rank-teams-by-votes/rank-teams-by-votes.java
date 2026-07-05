class Solution {
    public String rankTeams(String[] votes) {
        int n = votes.length;
        int m = votes[0].length();

        int[][] hash = new int[26][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                char c = votes[i].charAt(j);
                hash[c-'A'][j]++;
            }
        }

        Character[] team = new Character[m];
        for(int i=0;i<m;i++)
        {
            team[i] = votes[0].charAt(i);
        }
        Arrays.sort(team, (a,b) -> {
            for(int i=0;i<m;i++)
            {
                if(hash[a-'A'][i] != hash[b-'A'][i])
                {
                    return hash[b-'A'][i] - hash[a-'A'][i];
                }
            }
            return a - b;
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++)
        {
            sb.append(team[i]);
        }
        return sb.toString();

    }
}