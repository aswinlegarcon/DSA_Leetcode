class Solution {
    public String makeSmallestPalindrome(String s) {
        char arr[] = s.toCharArray();
        int n = arr.length;
        for(int i=0;i<=n/2;i++)
        {
            char left = arr[i];
            char right = arr[n-i-1];
            if(left!=right)
            {
                if(left<right)
                {
                    arr[n-i-1] = left;
                }
                else
                {
                    arr[i] = right;
                }
            }
        }
        return new String(arr);
    }
}