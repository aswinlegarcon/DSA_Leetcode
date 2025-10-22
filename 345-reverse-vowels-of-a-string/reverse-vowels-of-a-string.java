class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        int l = 0;
        int r = n-1;
        StringBuilder sb = new StringBuilder(s);
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        while(l<r)
        {
            while(l<r && !set.contains(Character.toLowerCase(s.charAt(l))))
            {
                l++;
            }
            while(l<r && !set.contains(Character.toLowerCase(s.charAt(r))))
            {
                r--;
            }
            char temp = s.charAt(l);
            sb.setCharAt(l,s.charAt(r));
            sb.setCharAt(r,temp);
            l++;r--;
        }
        return sb.toString();
    }
}