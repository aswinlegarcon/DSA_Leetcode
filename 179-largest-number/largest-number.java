class Solution {
    public String largestNumber(int[] nums) {

        ArrayList<String> temp = new ArrayList<>();
        for(int num:nums)
        {
            temp.add(String.valueOf(num));
        }
        Collections.sort(temp,(a,b)-> (b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        for(String s:temp)
        {
            sb.append(s);
        }

        return sb.toString().charAt(0)=='0'?"0":sb.toString();

    }
}