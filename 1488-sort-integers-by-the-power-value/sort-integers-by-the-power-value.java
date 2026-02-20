class Pair{
   public int number;
   public int power; 

   public Pair(int number,int power)
   {
        this.number = number;
        this.power = power;
   }
}
class Solution {
    public int getKth(int lo, int hi, int k) {
        ArrayList<Pair> lst = new ArrayList<>();
        for(int i=lo;i<=hi;i++)
        {
            int temp = i;
            int cnt = 0;
            while(temp>1)
            {
                if(temp%2==0)
                {
                    temp = temp/2;
                }
                else
                {
                    temp = 3*temp+1;
                }
                cnt++;
            }
            lst.add(new Pair(i,cnt));
        }
        Collections.sort(lst, (a,b) -> {
            int rem = a.power - b.power;
            if(rem==0)
            {
                return a.number - b.number;
            }
            return rem;
        });


        return lst.get(k-1).number;
    }
}