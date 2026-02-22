class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] arr = new int[friends.length];
        HashSet<Integer> set = new HashSet<>();
        for(int num:friends)
        {
            set.add(num);
        }
        int ind = 0;
        for(int i=0;i<order.length;i++)
        {
            if(set.contains(order[i]))
            {
                arr[ind] = order[i];
                ind++;
            }
        }
        return arr;
    }
}