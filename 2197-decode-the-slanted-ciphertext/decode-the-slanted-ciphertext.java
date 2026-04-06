class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if(rows==1) return encodedText;
        int n = encodedText.length();
        int cols = (int)Math.ceil((double)n/rows);
        char mat[][] = new char[rows][cols];
        char encoded[] =  encodedText.toCharArray();
        int ind = 0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                mat[i][j] = encoded[ind];
                ind++;
            }
        }
        StringBuilder sb = new StringBuilder();   
        for(int i=0;i<cols;i++)
        {
            int row = 0;
            int col = i;
            while(row<rows && col < cols)
            {
                sb.append(mat[row][col]);
                row++;
                col++;
            }
        
        }
        return sb.toString().replaceAll("\\s+$","");
    }
}