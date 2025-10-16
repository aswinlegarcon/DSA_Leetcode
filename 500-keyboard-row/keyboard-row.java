class Solution {
    public String[] findWords(String[] words) 
    {

        String[] lst = new String[3];
        lst[0] = "qwertyuiop";
        lst[1] = "asdfghjkl";
        lst[2] = "zxcvbnm";
        int n = words.length;
        
        String[] ans = new String[n];
        int ind = 0;

        for(int i=0;i<n;i++)
        {
            String cur = words[i];
            int row = 0;
            if(lst[1].contains(cur.substring(0,1).toLowerCase()))
            {
                row = 1;
            }
            else if(lst[2].contains(cur.substring(0,1).toLowerCase()))
            {
                row = 2;
            }
            boolean check = false;
            for(int j=0;j<cur.length();j++)
            {
                if(!lst[row].contains(cur.substring(j,j+1).toLowerCase()))
                {
                    check = true;
                    break;
                }
            }
            if(!check){
                ans[ind] = cur;
                ind++;
            } 
        }

        return Arrays.copyOf(ans,ind);

    }
}