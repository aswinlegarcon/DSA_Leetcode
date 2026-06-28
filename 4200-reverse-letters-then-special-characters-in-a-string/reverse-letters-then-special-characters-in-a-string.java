class Solution {
    public String reverseByType(String s) {
        char[] arr = s.toCharArray();
        ArrayList<Character> spcl = new ArrayList<>();
        ArrayList<Character> normal = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            char c = arr[i];
            if(Character.isLetter(c))
            {
                normal.add(c);
            }
            else
            {
                spcl.add(c);
            }
        }
        int spclInd = spcl.size()-1;
        int normalInd = normal.size()-1;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            char c = arr[i];
            if(Character.isLetter(c))
            {
                sb.append(""+normal.get(normalInd--));
            }
            else
            {
                sb.append(""+spcl.get(spclInd--));
            }
        }
        return sb.toString();
    }
}