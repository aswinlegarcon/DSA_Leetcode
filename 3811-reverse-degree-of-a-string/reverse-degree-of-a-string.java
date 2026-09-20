class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            int revInd = 26 - (s.charAt(i)-'a');
            int strInd = i+1;
            int prod = revInd * strInd;
            sum += prod;
        }
        return sum;
    }
}