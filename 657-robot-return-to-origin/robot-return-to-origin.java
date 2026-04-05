class Solution {
    public boolean judgeCircle(String moves) {
        int leftRightCnt = 0;
        int topDownCnt = 0;
        for(int i=0;i<moves.length();i++)
        {
            char move = moves.charAt(i);
            if(move=='U') topDownCnt++;
            else if(move=='D') topDownCnt--;
            else if(move=='L') leftRightCnt--;
            else leftRightCnt++;
        }
        return leftRightCnt==0 && topDownCnt==0 ? true : false;
    }
}