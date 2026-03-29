class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        int n = s1.length();
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        // string 1 change
        swap(arr1,0,2);
        if(isEqual(arr1,s2)) return true;
        swap(arr1,0,2);

        swap(arr1,1,3);
        if(isEqual(arr1,s2)) return true;

        swap(arr1,0,2);
        if(isEqual(arr1,s2)) return true;

        // strign 2 change
        swap(arr2,0,2);
        if(isEqual(arr2,s1)) return true;
        swap(arr2,0,2);

        swap(arr2,1,3);
        if(isEqual(arr2,s1)) return true;

        swap(arr2,0,2);
        if(isEqual(arr2,s1)) return true;

        return false;
    }

    private void swap(char arr[],int i,int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private boolean isEqual(char arr[],String temp)
    {
        for(int i=0;i<4;i++)
        {
            if(arr[i] != temp.charAt(i)) return false;
        }
        return true;
    }
}