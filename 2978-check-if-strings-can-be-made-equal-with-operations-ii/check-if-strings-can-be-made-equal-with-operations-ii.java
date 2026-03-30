class Solution {
    public boolean checkStrings(String s1, String s2) {
         int n = s1.length();
        
        StringBuilder s1even = new StringBuilder();
        StringBuilder s1odd = new StringBuilder();
        StringBuilder s2even = new StringBuilder();
        StringBuilder s2odd = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                s1even.append(s1.charAt(i));
                s2even.append(s2.charAt(i));
            } else {
                s1odd.append(s1.charAt(i));
                s2odd.append(s2.charAt(i));
            }
        }

        char[] s1evenArr = s1even.toString().toCharArray();
        char[] s2evenArr = s2even.toString().toCharArray();
        char[] s1oddArr = s1odd.toString().toCharArray();
        char[] s2oddArr = s2odd.toString().toCharArray();

        Arrays.sort(s1evenArr);
        Arrays.sort(s2evenArr);
        Arrays.sort(s1oddArr);
        Arrays.sort(s2oddArr);

        return Arrays.equals(s1evenArr, s2evenArr) &&
               Arrays.equals(s1oddArr, s2oddArr);

    }
}