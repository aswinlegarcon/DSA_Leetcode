class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        return helpChar(k,sb);
    }

        public char helpChar(int k,StringBuilder sb)
        {
            if(sb.toString().length()>=k)
            {
                return sb.toString().charAt(k-1);
            }
            String toAppend = "";
            for(char each:sb.toString().toCharArray())
            {
                toAppend += ++each;
            }
            System.out.println(toAppend);

            sb.append(toAppend);
            return helpChar(k,sb);
        }
    }
