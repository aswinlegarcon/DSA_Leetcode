class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for(String temp:words)
        {
            sb.append(temp);
            if(sb.toString().equals(s)) return true;
        }
        return sb.toString().equals(s);
    }
}