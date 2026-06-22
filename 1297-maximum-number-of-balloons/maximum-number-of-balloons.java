class Solution {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();
        int[] arr = new int[26];
        for(int i=0;i<n;i++)
        {
            arr[text.charAt(i)-'a']++;
        }

        arr['o'-'a'] = arr['o'-'a']/2;
        arr['l'-'a'] =   arr['l'-'a']/2;
        int min   = arr[0];
        min = Math.min(min,Math.min(arr['b'-'a'],Math.min(arr['l'-'a'],Math.min(arr['o'-'a'],arr['n'-'a']))));
        return min;
        
    }
}