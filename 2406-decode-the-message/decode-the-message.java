class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        char arr[] = key.toCharArray();
        int ind = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == ' ') continue;
            if(map.get(arr[i])==null)
            {
                int temp = ind + 'a';
                ind++;
                map.put(arr[i],(char)temp);
            }
        }
        StringBuilder sb = new StringBuilder();
        char msgArray[] = message.toCharArray();
        for(int i=0;i<msgArray.length;i++)
        {
            if(msgArray[i]==' ') sb.append(" ");
            else sb.append(map.get(msgArray[i]));
        }
        return sb.toString();
    }
}