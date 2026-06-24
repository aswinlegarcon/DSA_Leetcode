class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8,10));
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        int totalDays = day;
        if(isLeapYear(year) && month > 2) totalDays++;

        for(int i=0;i<month-1;i++)
        {
            totalDays += months[i];
        } 
        return totalDays;
    }

    private boolean isLeapYear(int year)
    {
        if(year % 400 == 0 || year % 4 == 0 && year%100 != 0) return true;
        return false;
    }
}