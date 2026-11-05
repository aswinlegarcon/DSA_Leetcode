class Solution {
    public int divisorSubstrings(int num, int k) {
        int c=0;
        String s=String.valueOf (num);
        for (int i = 0; i<=s.length()- k; i++) {
            int v=Integer.parseInt(s.substring(i, i + k));
            if(v!=0 && num%v==0){
                c+=1;
            }
        }
        return c;
    }
}