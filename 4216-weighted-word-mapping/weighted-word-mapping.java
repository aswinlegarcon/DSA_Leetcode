class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            int weightOfWord = 0;

            for (char ch : w.toCharArray()) {
                weightOfWord += weights[ch - 'a'];
            }

            weightOfWord %= 26;
            sb.append((char) ('z' - weightOfWord));
        }

        return sb.toString();
    }
}