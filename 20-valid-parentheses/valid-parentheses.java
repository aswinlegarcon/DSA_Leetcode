class Solution {
    public boolean isValid(String s) {
        Stack<Character> braces = new Stack<>();
        if(s.length() % 2 == 1) return false;
        for(int i=0;i<s.length();i++)
        {
            char input = s.charAt(i);
            if(input == '(' || input == '[' || input == '{')
            {
                braces.push(input);
            }
            else if(input == ')')
            {
                if(!braces.isEmpty() && braces.peek() == '(')
                {
                    braces.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(input == ']')
            {
                if(!braces.isEmpty() && braces.peek() == '[')
                {
                    braces.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(!braces.isEmpty() && input == '}')
            {
                if(braces.peek() == '{')
                {
                    braces.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if(braces.size() == 0)
        {
            return true;
        }
        return false;
    }
}