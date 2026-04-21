class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int lcnt = 0;
        int rcnt = 0;
        int n = moves.length();
        for(int i=0;i<n;i++)
        {
            char c = moves.charAt(i);
            if(c=='L')
            {
                lcnt++;
            }
            else if(c=='R')
            {
                rcnt++;
            }
        }

        if(lcnt>=rcnt)
        {
            return n-rcnt*2;
        }
        return n-lcnt*2;
    }
}