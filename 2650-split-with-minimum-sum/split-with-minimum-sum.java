class Solution {
    public int splitNum(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        int n = arr.length;
        Arrays.sort(arr);
        String str1 = new String();
        String str2 = new String();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                str1 += arr[i];
            }
            else{
                str2 += arr[i];
            }
        }
        return Integer.valueOf(str1) + Integer.valueOf(str2);
    }
}