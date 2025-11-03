class Solution {
    public int appendCharacters(String s, String t) {
        int l = 0;
        int r = 0;
        int ans = 0;
        int n = s.length();
        int m = t.length();

        while(l<n && r<m)
        {
            char c1 = s.charAt(l);
            char c2 = t.charAt(r);

            if(c1 == c2)
            {
                l++;
                r++;
            }
            else
            {
                l++;
            }
        }

        ans += m-r;
        return ans;
    }
}