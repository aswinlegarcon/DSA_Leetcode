class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char a1 = coordinate1.charAt(0);
        int a2 = coordinate1.charAt(1) - '0';
        char b1 = coordinate2.charAt(0);
        int b2 = coordinate2.charAt(1) - '0';
        ArrayList<Character> odd = new ArrayList<>(Arrays.asList('a','c','e','g'));
        ArrayList<Character> even = new ArrayList<>(Arrays.asList('b','d','f','h'));

        if(odd.contains(a1) && odd.contains(b1) || even.contains(a1) && even.contains(b1))
        {
            int x = a2%2;
            int y = b2%2;
            if(x==y) return true;
            else return false;
        }
        else if(even.contains(a1) && odd.contains(b1) || odd.contains(a1) && even.contains(b1))
        {
            int x = a2%2;
            int y = b2%2;
            if(x==0 && y==1 || x==1 && y==0) return true;
        }
        return false;
    }
}