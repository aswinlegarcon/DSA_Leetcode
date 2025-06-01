class Solution {
    public String reverseOnlyLetters(String s) {
        
        StringBuilder ans = new StringBuilder(s);
        int n = s.length();
        int index = n-1;
        for(int i=0;i<n;i++)
        {
            while(index>=0 && !Character.isLetter(s.charAt(index))) index--;
            char c = s.charAt(i);
            if(Character.isLetter(c))
            {
                ans.setCharAt(index,c);
                index--;
            }
            
            
            
        }
        return ans.toString();
    }
}