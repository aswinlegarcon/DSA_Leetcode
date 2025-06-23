class Solution {
    public int findMinDifference(List<String> timePoints) {

        ArrayList<Integer> diff = new ArrayList<>();

        for (String time : timePoints) 
        {
            String[] arr = time.split(":");
            int hour = Integer.parseInt(arr[0]);
            int minutes = Integer.parseInt(arr[1]);
            int total = hour * 60 + minutes;
            diff.add(total);
        }

        Collections.sort(diff);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<diff.size()-1;i++)
        {
            int difference = diff.get(i+1) - diff.get(i);
            min = Math.min(difference,min);
        }

        int lastDiff = (24*60) - diff.get(diff.size()-1) + diff.get(0); // for handling 23.59 - 00.00
        min = Math.min(lastDiff,min);

        return min;
    }
}