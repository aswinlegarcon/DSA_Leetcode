class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean solve(char[][] board)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j] == '.')
                {
                    for(char c = '1';c<='9';c++)
                    {
                        if(isValid(board,i,j,c))
                        {
                            board[i][j] = c;
                            if(solve(board))
                            {
                                return true;
                            }
                            else
                            {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValid(char[][] board,int row,int col,int digit)
    {
        for(int i=0;i<board.length;i++)
        {
            if(board[row][i] == digit) return false;
            if(board[i][col] == digit) return false;
        }
        int srow = (row/3)*3;
        int scol = (col/3)*3;
        for(int i=srow;i<=srow+2;i++)
        {
            for(int j=scol;j<=scol+2;j++)
            {
                if(board[i][j] == digit) return false;
            }
        }
        return true;
    }
}