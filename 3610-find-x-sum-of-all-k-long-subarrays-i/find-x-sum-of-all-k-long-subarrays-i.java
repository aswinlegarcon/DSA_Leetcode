class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[n-k+1];
        for(int i=0;i<k;i++)
        {
            map.put( nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        ans[0] = helper(map,x);
        int l = 0;
        int r = k;
        int ind = 1;
        while(r<n)
        {
            map.put(nums[l],map.get(nums[l]) - 1);
            map.put(nums[r],map.getOrDefault(nums[r] , 0) + 1);
            ans[ind] =  helper(map,x);
            l++;
            r++;
            ind++;
        }
        return ans;
    }

    private int helper(HashMap<Integer,Integer> map,int x)
    {
        PriorityQueue<int[]> pq = new PriorityQueue<>( (a,b) -> {
                int diff = b[1] - a[1];
                if(diff==0) return b[0] - a[0];
                return diff;
        });

        for(var entry:map.keySet())
        {
            int[] temp = new int[2];
            temp[0] = entry;
            temp[1] = map.get(entry);
            pq.add(temp);
        }
        int sum = 0;
        if(pq.size()<x)
        {
            while(!pq.isEmpty())
            {
                int[] top = pq.poll();
                sum += top[0] * top[1];
            }
        }
        else
        {
            for(int i=1;i<=x;i++)
            {
                int[] top = pq.poll();
                sum += top[0] * top[1];
            }
        }
    
        return sum;
    }
}