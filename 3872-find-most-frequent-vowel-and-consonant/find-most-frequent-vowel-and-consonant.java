class Solution {
    public int maxFreqSum(String s) {
        int n = s.length();
        int arr[] = new int[26];

        for(int i=0;i<n;i++) {
            char c = s.charAt(i);
            arr[c-'a']++;
        }

        int maxVow = 0;
        int maxCon = 0;

        for(int i=0;i<26;i++) {
            char ch = (char)(i + 'a');
            if(isVowel(ch)) {
                maxVow = Math.max(maxVow, arr[i]);
            } else {
                maxCon = Math.max(maxCon, arr[i]);
            }
        }

        return maxCon + maxVow;
    }

    private boolean isVowel(char c) {
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }
}
