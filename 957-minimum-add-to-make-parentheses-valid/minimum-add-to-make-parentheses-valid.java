class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int open = 0;
        int neededToOpen = 0;
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(c == '(') open++;
            else if(c == ')')
            {
                if(open > 0) open--; // closing the existing open.
                else neededToOpen++; // new open needed.
            }
        }
        return open + neededToOpen; // remaining open is added becoz those have to be closed.
    }
}