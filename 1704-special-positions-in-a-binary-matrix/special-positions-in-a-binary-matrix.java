class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            top:for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1)
                {
                    for(int k=i-1;k>=0;k--)
                    {
                        if(mat[k][j]==1) continue top;
                    }
                    for(int k=i+1;k<n;k++)
                    {
                        if(mat[k][j]==1) continue top;
                    }
                    for(int k=j-1;k>=0;k--)
                    {
                        if(mat[i][k]==1) continue top;
                    }
                    for(int k=j+1;k<m;k++)
                    {
                        if(mat[i][k]==1) continue top;
                    }
                    cnt++;
                }
            }
        }
        return cnt;
    }
}