class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> lst = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int min = Integer.MAX_VALUE;
            int minInd = -1;
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    minInd = j;
                }
            }
            //col parsing
            int max = Integer.MIN_VALUE;
            for(int j=0;j<n;j++)
            {
                max = Math.max(max,matrix[j][minInd]);
            }
            if(min == max)
            {
                lst.add(min);
            }
        }
        return lst;
    }
}