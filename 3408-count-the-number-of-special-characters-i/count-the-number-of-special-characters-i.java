class Solution {
    public int numberOfSpecialChars(String word) {
        byte lower[] = new byte[26];
        byte upper[] = new byte[26];
        for(int i=0;i<word.length();i++)
        {
            char c = word.charAt(i);
            if(Character.isLowerCase(c))
            {
                lower[c-'a'] = 1;
            }
            else
            {
                upper[c-'A'] = 1;
            }
        }   

        int cnt = 0;
        for(int i=0;i<26;i++)
        {
            if(lower[i]==1 && upper[i]==1) cnt++;
        } 
        return cnt;
    }
}