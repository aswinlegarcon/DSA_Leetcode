class Solution {
    public String reverseWords(String s) {
        
        String[] arr = s.trim().split("\\s+");
        String result = "";
        for(int i=arr.length-1;i>=0;i--)
        {
            if(i>0) result = result + arr[i] + " ";
            else result = result + arr[i];
            
        }
        return result;
    }
}