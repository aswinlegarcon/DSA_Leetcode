class Solution {
    public int numberOfSpecialChars(String word) {
        int cnt = 0;
        for(int i=0;i<26;i++)
        {
            if(word.contains("" + (char)('a'+ i)) && word.contains("" + (char)('A' + i)))
            {
                cnt++;
            }
        }        
        return cnt;
    }
}