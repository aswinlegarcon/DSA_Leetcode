class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for(int i=0;i<n;i++)
        {
            if(!check(matrix[i])) return false;
            int col[] = new int[n];
            for(int j=0;j<n;j++)
            {
                col[j] = matrix[j][i];
            }
            if(!check(col)) return false;
        }
        
        return true;
    }

    private boolean check(int[] arr)
    {
        int n = arr.length;
        int hash[] = new int[n+1];
        for(int i=0;i<n;i++)
        {
            hash[arr[i]]++;
        }

        for(int i=1;i<=n;i++)
        {
            if(hash[i]!=1) return false;
        }
        return true;
    }
}