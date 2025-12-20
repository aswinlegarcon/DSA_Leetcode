class Solution {
    public int minDeletionSize(String[] strs) {
        int cnt = 0;
        for(int i=0;i<strs[0].length();i++)
        {
            boolean check = true;
            for(int j=0;j<strs.length-1;j++)
            {
                char a = strs[j].charAt(i);
                char b = strs[j+1].charAt(i);
                if(b<a) check = false;
            }
            if(!check) cnt++;
        }
        return cnt;
    }
}