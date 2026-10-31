class Solution {
    public int largestInteger(int n, int s) {
        int num = 0;
        if(s==0) return 0;
        if(n==1) num = 9;
        else if(n==2) num = 99;
        else if(n==3) num = 999;
        else if(n==4) num = 9999;
        else if(n==5) num = 99999;

        for(int i = num;i>=1;i--)
        {
            int temp = i;
            int sum = 0;
            while(temp>0){
                int rem = temp%10;
                sum += rem;
                temp = temp/10;
            }
            if(sum==s) return i;
        }
        return -1;
    }
}