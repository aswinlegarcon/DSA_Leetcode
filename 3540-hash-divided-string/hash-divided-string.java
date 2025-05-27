class Solution {
    public String stringHash(String s, int k) {
        String result = "";
        int n = s.length();
        int stInd = 0;
        int endInd = k;
        for(int i=1;i<=n/k;i++)   
        {
            String temp = s.substring(stInd,endInd);
            stInd = endInd;
            endInd += k;
            System.out.print(temp );
            int sum = 0;
            for(int j=0;j<temp.length();j++)
            {
                sum = sum + (temp.charAt(j)-'a');
            }
            char toAdd = 'a';
            toAdd  += (sum%26);
            result += toAdd;
           
        }
        return result;
    }
}