class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int num = 1;
        for(int i=1;i<=n;i++)
        {
            sumOdd += num;
            num += 2;
        }
        int sumEven = 0;
        num = 0;
        for(int i=1;i<=n;i++)
        {
            sumEven += num;
            num += 2;
        }

        int gcd = getGcd(sumOdd,sumEven);

        return gcd;
    }

    private int getGcd(int a,int b){
        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}