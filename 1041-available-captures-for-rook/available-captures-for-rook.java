class Solution {
    public int numRookCaptures(char[][] board) {
        int rook[] = new int[2];
        int n = 8;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]=='R'){
                    rook[0] = i;
                    rook[1] = j;
                    break;
                }
            }
        }


        int cnt = 0;
        int row = rook[0];
        int col = rook[1];
        // left
        for(int j=col-1;j>=0;j--)
        {
            if(board[row][j] == '.') continue;
            else{
                if(board[row][j] == 'p') cnt++;
                break;
            }
        }
        //right

        for(int j=col+1;j<n;j++)
        {
            if(board[row][j] == '.') continue;
            else{
                if(board[row][j] == 'p') cnt++;
                break;
            }
        }
        

        //top

        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col] == '.') continue;
            else{
                if(board[i][col] == 'p') cnt++;
                break;
            }
        }

        //bottom
        for(int i=row+1;i<n;i++)
        {
            if(board[i][col] == '.') continue;
            else{
                if(board[i][col] == 'p') cnt++;
                break;
            }
            
        }

        return cnt;
        
    }
}
