class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int n = arr1.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean check1 = true;
        boolean check2 = true;
        for(int i=n-1;i>=0;i--)
        {
            if(arr1[i] < arr2[i]) check1 = false;
            if(arr2[i] < arr1[i]) check2 = false;
        }
        return check1 || check2;
    }
}