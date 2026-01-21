class Solution {
    public int similarPairs(String[] words) {
        int n = words.length;
        int cnt = 0;
        boolean arr[][] = new boolean[n][26];
        for(int i=0;i<n;i++)
        {
            for(char c:words[i].toCharArray())
            {
                arr[i][c - 'a'] = true;
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(Arrays.equals(arr[i],arr[j])) cnt++;
            }
        }
        return cnt;
    }
}