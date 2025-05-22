class Solution {
    public boolean checkRecord(String s) {
        int cntA = 0;
        int cntL = 0;
        boolean check = false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='L') 
            {
                cntL++;
                if(cntL==3) check = true;
            }
            else if(s.charAt(i)=='A') 
            {
                cntL = 0;
                cntA++;
            }
            else
            {
                cntL = 0;
            }
            
                       
        }

        if(cntA < 2 && !check)
        {
            return true;
        }
        return false;
    }
}