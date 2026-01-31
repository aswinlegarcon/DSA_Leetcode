class Solution {
    public int countAsterisks(String s) {
        boolean bar = false;
        int cnt = 0;
        char arr[] = s.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i] == '|')
            {
                if (!bar) bar = true;
                else bar = false;
            }
            if(!bar && arr[i]=='*') cnt++;
        }

        return cnt;
    }
}