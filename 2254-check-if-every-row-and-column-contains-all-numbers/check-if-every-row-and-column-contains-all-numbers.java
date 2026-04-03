class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        int[] row = new int[n+1];
        int[] col = new int[n+1];
        for(int i = 0 ; i< n ; i++){
            for (int j = 0 ; j< n ; j++){
                int a = matrix[i][j];
                int b = matrix[j][i];
                
                if ( i == j ){
                    if (row[a]==0 && col[b]==0){
                        row[a]=1;
                        col[b]=1;
                    }else{
                        return false;
                    }
                }else{
                    if (row[a]==0){
                        row[a]=1;
                    }else{
                        return false;
                    }
                    if (col[b]==0){
                        col[b]=1;
                    }else{
                        return false;
                    }
                }

            }
            row= new int[n+1];
            col= new int[n+1];
        }
        return true;
    }
}