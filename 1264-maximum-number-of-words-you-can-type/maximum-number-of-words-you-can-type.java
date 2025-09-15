class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        int cnt = arr.length;
        int n = brokenLetters.length();
        int ind = 0;
        for(int i=0;i<arr.length;i++)
        {
            String temp = arr[i];
            for(int j=0;j<n;j++)
            {
                char c = brokenLetters.charAt(j);
                if(temp.contains(c+"")) {
                    cnt--;
                    break;
                }
            }
        }
        return cnt;
        
    }
}