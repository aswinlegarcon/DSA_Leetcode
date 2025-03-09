class Solution {
    public String convertToBase7(int num) {
        String result = "";
        boolean checkMinus = false;
        if(num<0)
        {
            checkMinus = true;
        }
        else if(num==0)
        {
            return "0";
        }
        num = Math.abs(num);
        while(num>0)
        {
            int remainder = num%7;
            num = num / 7;
            result = remainder + ""+ result ; 
        }
        if(checkMinus)
        {
             return "-" + result;
        }
        return result;
    }
}