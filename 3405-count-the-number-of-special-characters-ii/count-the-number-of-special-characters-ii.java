class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> lower = new HashMap<>();
        HashMap<Character,Integer> upper = new HashMap<>();

        for(int i=0;i<word.length();i++)
        {
            char c = word.charAt(i);
            if(Character.isUpperCase(c)){
                if(!upper.containsKey(c))
                {
                    upper.put(c,i);
                }
            }
            else{
                    lower.put(c,i);
            }
        }
        int cnt = 0;
        for(char c:upper.keySet())
        {
            char lowerC = (char)(c+32);
            int indOfUpper = upper.get(c);
            if(!lower.containsKey(lowerC)) continue;
            int indOfLower = lower.get(lowerC);
            if(indOfLower < indOfUpper) cnt++;
        }
        return cnt;
    }
}