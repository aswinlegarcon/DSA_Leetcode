class Solution {
    
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> transformedSet = new HashSet<>();
        for(int i=0;i<words.length;i++)
        {
            String curr = words[i];
            StringBuilder temp = new StringBuilder();
            for(int j=0;j<curr.length();j++)
            {
                temp.append(morse[curr.charAt(j)-'a']);
            }
            transformedSet.add(temp.toString());
        }
        return transformedSet.size();

    }

}