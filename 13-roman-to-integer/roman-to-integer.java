class Solution {
    public int romanToInt(String s) 
    {
        
        int sum = 0;
        for(int i=0;i<s.length();i++)
        {
            switch(s.charAt(i))
            {
                case 'I':
                if( i<s.length()-1 && s.charAt(i+1) == 'V')
                {  
                    sum += 4;
                    i = i+1;
                    continue;
                }
                else if(i<s.length()-1 && s.charAt(i+1) == 'X')
                {
                    sum += 9;
                    i = i+1;
                    continue;
                }
                sum += 1;
                break;
                case 'V':
                sum += 5;
                break;
                case 'X':
                if(i<s.length()-1 && s.charAt(i+1) == 'L')
                {
                    sum += 40;
                    i = i+1;
                    continue;
                }
                else if(i<s.length()-1 && s.charAt(i+1) == 'C')
                {
                    sum += 90;
                    i = i+1;
                    continue;
                }
                sum += 10;
                break;
                case 'L':
                sum += 50;
                break;
                case 'C':
                if(i<s.length()-1 && s.charAt(i+1) == 'D')
                {
                    sum += 400;
                    i = i+1;
                    continue;
                }
                else if(i<s.length()-1 && s.charAt(i+1) == 'M')
                {
                    sum += 900;
                    i = i+1;
                    continue;
                }
                sum += 100;
                break;
                case 'D':
                sum += 500;
                break;
                case 'M':
                sum += 1000;
                break;
            }
        }
        return sum;
        
    }
}