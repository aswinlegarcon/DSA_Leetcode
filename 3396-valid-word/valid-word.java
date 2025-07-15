class Solution {
    public boolean isValid(String word) {
        ArrayList<Character> arr = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        if(word.length()>=3)
        {
            String pattern = "[a-zA-Z0-9]+";
            if(word.matches(pattern))
            {
                boolean vowel = false;
                boolean consonant = false;
                for(int i=0;i<word.length();i++)
                {
                    if(arr.contains(word.charAt(i))) vowel = true;
                    if(!Character.isDigit(word.charAt(i)) && !arr.contains(word.charAt(i))) consonant = true;
                }
                if(vowel && consonant) return true;
            }
        }
        return false; 
    }
}