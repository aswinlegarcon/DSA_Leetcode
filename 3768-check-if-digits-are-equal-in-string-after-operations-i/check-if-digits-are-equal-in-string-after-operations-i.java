class Solution {
    public boolean hasSameDigits(String s) {
        
        String ans = s;
        while(ans.length()>2)
        {
            char[] temp = ans.toCharArray();
            StringBuilder sb = new StringBuilder();
            int n = temp.length;
            for(int i=0;i<n-1;i++)
            {
                sb.append((temp[i]-'0'+temp[i+1]-'0') % 10);
            }
            ans = sb.toString();
        }
        if(ans.charAt(0)==ans.charAt(1)) return true;
        return false;
    }
}