// User function Template for Java

class Solution {
    static List<Integer> minPartition(int N) {
        // code here
        List<Integer> ans = new ArrayList<>();
        while(N>0)
        {
            if(N>=2000)
            {
                N = N-2000;
                ans.add(2000);
            }
            else if(N>=500)
            {
                N = N-500;
                ans.add(500);
            }
            else if(N>=200)
            {
                N = N-200;
                ans.add(200);
            }
            else if(N>=100)
            {
                N = N-100;
                ans.add(100);
            }
            else if(N>=50)
            {
                N = N-50;
                ans.add(50);
            }
            else if(N>=20)
            {
                N = N-20;
                ans.add(20);
            }
            else if(N>=10)
            {
                N = N-10;
                ans.add(10);
            }
            else if(N>=5)
            {
                N = N-5;
                ans.add(5);
            }
            else if(N>=2)
            {
                N = N-2;
                ans.add(2);
            }
            else
            {
                N = N-1;
                ans.add(1);
            }
        }
        return ans;
    }
}