class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int cnt = 0;
        top:while(true)
        {
            for(int i=0;i<tickets.length;i++)
            {

                if(tickets[i]==0) continue;
                else 
                {
                    tickets[i]--;
                    cnt++;
                }
                if(i==k && tickets[i]==0)
                {
                    break top;
                }
            }
        }
        return cnt;
        
    }
}