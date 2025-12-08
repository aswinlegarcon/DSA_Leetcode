class Solution {
    public int countTriples(int n) {
        int cnt = 0;
        for(int i=2;i<=n;i++)
        {
            for(int j=2;j<=n;j++)
            {
                for(int k=j+1;k<=n;k++)
                {
                    int sum = ((i*i) + (j*j));
                    if( sum == (k*k) ) cnt++;
                    else if(sum < (k*k)) break;
                }
            }
        }
        return cnt;
    }
}