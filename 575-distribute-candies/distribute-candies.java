class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int max = n/2;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(candyType[i]);
            if(set.size()==max) return set.size();
        }
        return set.size();
    }
}