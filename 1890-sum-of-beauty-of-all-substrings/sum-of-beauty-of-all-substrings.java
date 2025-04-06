class Solution {
    public int beautySum(String s) {
        int sum=0;
         for (int i = 0; i < s.length(); i++) {
             int[] freq=new int[26];
             int maxcount=0;
             int mincount=Integer.MAX_VALUE;
            for (int j = i; j < s.length(); j++) {
                char ch=s.charAt(j);
                freq[ch-'a']++; 
                maxcount=Math.max(maxcount,freq[ch-'a']);
                mincount=Integer.MAX_VALUE;
                for (int k = 0; k < freq.length; k++) {
                    if (freq[k] > 0) {   
                        mincount = Math.min(mincount, freq[k]);
                    }
                }
                sum+=maxcount-mincount;
            }   
        }
         return sum;
    }
}