class Solution {

    public void solve(int col,char[][] board,List<List<String>> ans)
    {
        if(col==board.length)
        {
            ans.add(construct(board));
            return;
        }
        for(int row=0;row<board.length;row++)
        {
            if(safe(board, row, col))
            {
                board[row][col] = 'Q';
                solve(col+1,board,ans);
                board[row][col] = '.';
            }
        }
    } 
    public List<String> construct(char[][] board) {
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

    public boolean safe(char[][] board,int row,int col)
    {
        int duprow = row;
        int dupcol = col;

        while(row>=0 && col >=0) // up diagnol
        {
            if(board[row][col] == 'Q') return false;
            col--;
            row--;
        }
        row = duprow;
        col = dupcol;
        while(col>=0) // straight
        {
            if(board[row][col]=='Q') return false;
            col--;
        }

        row = duprow;
        col = dupcol;
        while(col>=0 && row<board.length)
        {
            if(board[row][col]=='Q') return false;
            col--;
            row++;
        }
        return true;


    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        solve(0,board,ans);
        return ans;
    }
}