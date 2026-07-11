class Solution {
    public boolean strongPasswordCheckerII(String password) {
        String spcChar = "!@#$%^&*()-+";
        boolean lowerCheck = false;
        boolean upperCheck = false;
        boolean digitCheck = false;
        boolean spcCheck = false;
        boolean adjacentCheck = true;

        char arr[] = password.toCharArray();
        if(arr.length < 8) return false;
        for(int i=0;i<arr.length;i++)
        {
            char c = arr[i];
            if(Character.isLowerCase(c)){
                lowerCheck = true;
            }
            else if(Character.isUpperCase(c)){
                upperCheck = true;
            }
            else if(Character.isDigit(c)){
                digitCheck = true;
            }
            else if(spcChar.contains(""+c)){
                spcCheck = true;
            }
            
            if(i+1 < arr.length)
            {
                if(arr[i] == arr[i+1]) adjacentCheck = false;
            }
            
        }

        return lowerCheck && upperCheck && digitCheck && spcCheck && adjacentCheck;

    }
}