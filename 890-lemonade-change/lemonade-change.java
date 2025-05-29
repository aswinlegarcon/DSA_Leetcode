class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int cost:bills)
        {
            if(cost==5) five++;
            else if(cost==10)
            {
                if(five>0)
                {
                    five--;
                    ten++;
                }
                else return false;
            }
            else if(cost==20)
            {
                if(five>0 && ten>0)
                {
                    five--;
                    ten--;
                }
                else if(five>=3)
                {
                    five = five-3;
                }
                
                else return false;
            }
        }
        return true;
    }
}