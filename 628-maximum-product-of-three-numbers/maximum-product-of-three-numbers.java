class Solution {
    public int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int num = nums[i];
            if(num<0) neg.add(num);
            else pos.add(num);
        }
        Collections.sort(neg);
        Collections.sort(pos);
        int posSize = pos.size();
        int negSize = neg.size();

        if(negSize>=2 && posSize>=1)
        {
            int prod = (neg.get(0) * neg.get(1)) * pos.get(posSize-1); 
            max = Math.max(max,prod);
        }
        if(posSize>=3){
            int prod = pos.get(posSize-1) * pos.get(posSize-2) * pos.get(posSize-3);
            max = Math.max(max,prod);
        }
        if(negSize>=3)
        {
            int prod = neg.get(negSize-1) * neg.get(negSize-2) * neg.get(negSize-3);
            max = Math.max(max,prod);
        }

        return max;
    }
}