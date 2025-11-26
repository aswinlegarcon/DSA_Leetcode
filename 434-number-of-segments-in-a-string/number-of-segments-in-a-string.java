class Solution {
    public int countSegments(String s) {
        int cnt = 0;
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=' ')
            {
                if(i==0 || arr[i-1]==' ') cnt++;
            }
        }
        return cnt;
    }
}