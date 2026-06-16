class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            char c = arr[i];
            if(Character.isLetter(c))
            {
                sb.append(c);
            }
            else
            {
                switch(c){
                case '*':
                    if(sb.length()>0)
                    {
                        sb.deleteCharAt(sb.length()-1);
                    }
                    break;
                case '#':
                    String dup = sb.toString();
                    sb.append(dup);
                    break;
                case '%':
                    String rev = sb.reverse().toString();
                    sb = new StringBuilder(rev);
                    break;
                }
            }
            
        }
        return sb.toString();
    }
}