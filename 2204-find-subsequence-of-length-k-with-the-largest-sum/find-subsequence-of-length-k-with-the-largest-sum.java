class Pair
{
    int num;
    int index;

    Pair(int num,int index)
    {
        this.num = num;
        this.index = index;
    }
}
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> Integer.compare(b.num,a.num));
        for(int i=0;i<nums.length;i++)
        {
            pq.add(new Pair(nums[i],i));
        }
        int[] indexes = new int[k];
        for(int i=0;i<k;i++)
        {
            Pair p = pq.poll();
            indexes[i] = p.index;
        }
        Arrays.sort(indexes);

        int sub[] = new int[k];
        for(int i=0;i<k;i++)
        {
            sub[i] = nums[indexes[i]];
        }
        return sub;
    }
}