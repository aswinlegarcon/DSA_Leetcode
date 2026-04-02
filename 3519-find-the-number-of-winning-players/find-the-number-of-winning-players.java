class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int hash[][] = new int[n][11];
        for(int i=0;i<pick.length;i++)
        {
            int index = pick[i][0];
            int color = pick[i][1];
            hash[index][color]++;
        }

        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            int arr[] = hash[i];
            Arrays.sort(arr);
            if(arr[10]>i) cnt++;
        }
        return cnt;
    }
}