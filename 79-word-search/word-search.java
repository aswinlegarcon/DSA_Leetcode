class Solution {

    public boolean exist(char[][] board, String word) {
        
        int n = board.length;
        int m = board[0].length;
        int index = 0;
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j] == word.charAt(index))
                {
                    if(search(board,word,i,j,index,n,m))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean search(char[][] board,String word,int row,int col,int index,int n,int m)
    {

        if(index==word.length())
        {
            return true;
        }

        if (row < 0 || col < 0 || row == n || col == m || 
        board[row][col]!=word.charAt(index) || board[row][col] == '!')
        {
            return false;
        }

        char c = board[row][col];
        board[row][col] = '!';

        boolean top = search(board,word,row-1,col,index+1,n,m);
        boolean right = search(board,word,row,col+1,index+1,n,m);
        boolean bottom = search(board,word,row+1,col,index+1,n,m);
        boolean left = search(board,word,row,col-1,index+1,n,m);

        board[row][col] = c;
        
        return top || right || left|| bottom;
    }

}