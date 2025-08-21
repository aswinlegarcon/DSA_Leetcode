class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        StringBuilder sb = new StringBuilder();
        
        int ind = 0;
        while(ind<n)
        {

            char c = chars[ind];
            sb.append(c);
            int cnt = 1;
            ind++;
            while(ind<n && c==chars[ind])
            {
                cnt++;
                ind++;
            }
            if(cnt!=1)
            {
                sb.append(cnt);
            }
        }
        
        for(int i=0;i<sb.length();i++)
        {
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}