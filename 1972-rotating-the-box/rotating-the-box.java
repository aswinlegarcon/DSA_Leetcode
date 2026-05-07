class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;
        char[][] ans = new char[n][m];

        for(int i=0;i<m;i++)
        {
            int ind = 0;
            for(int j=0;j<n;j++)
            {
                char curr = boxGrid[i][j];
                if(curr == '.')
                {
                    boxGrid[i][j] = boxGrid[i][ind];
                    boxGrid[i][ind] = curr;
                    ind++;
                }
                else if(curr == '*')
                {
                    ind = j+1;
                }
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans[j][m-1-i] = boxGrid[i][j];
            }
        }



        return ans;
    }
}

