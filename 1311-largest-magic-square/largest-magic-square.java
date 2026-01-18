class Solution {
    public int largestMagicSquare(int[][] grid) {

    int m = grid.length;
    int n = grid[0].length;
    int maxSize = Math.min(m, n);
    for (int size = maxSize; size >= 2; size--) {

        for (int i = 0; i + size <= m; i++) {
            for (int j = 0; j + size <= n; j++) {
                if (calculate(grid, i, j, size)) {
                    return size;
                }
            }
        }
        
    }
    return 1;
}


    private boolean calculate(int[][] mat, int startRow, int startCol, int size) {

    int targetSum = 0;
    for (int j = 0; j < size; j++) {
        targetSum += mat[startRow][startCol + j];
    }
    int leftDiagSum = 0;
    int rightDiagSum = 0;

    for (int i = 0; i < size; i++) {
        int rowSum = 0;
        int colSum = 0;

        for (int j = 0; j < size; j++) {
            rowSum += mat[startRow + i][startCol + j];
            colSum += mat[startRow + j][startCol + i];
        }

        if (rowSum != targetSum || colSum != targetSum)
            return false;

        leftDiagSum += mat[startRow + i][startCol + i];
        rightDiagSum += mat[startRow + i][startCol + size - 1 - i];
    }

    return leftDiagSum == targetSum && rightDiagSum == targetSum;
}

}