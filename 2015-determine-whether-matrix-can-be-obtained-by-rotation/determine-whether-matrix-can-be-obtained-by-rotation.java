class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        if(check(mat,target)) return true;
        for(int i=1;i<=3;i++)
        {
            mat = rotate(mat,n);
            if(check(mat,target)) return true;
        }

        return false;
        


      
    }

    public int[][] rotate(int[][] mat,int n)
    {
        int temp[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp[j][n-i-1] = mat[i][j];
            }
        }

        return temp;
    }

    public boolean check(int[][] mat,int[][] target)
    {
        int n = mat.length;
        boolean check = true;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]!=target[i][j])
                {
                    check = false;
                }
            }
        }
        if(check) return true;
        return false;
    }
}