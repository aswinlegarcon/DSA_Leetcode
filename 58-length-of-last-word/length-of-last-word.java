class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        String word = words[words.length - 1];
        return word.length();
    }
}