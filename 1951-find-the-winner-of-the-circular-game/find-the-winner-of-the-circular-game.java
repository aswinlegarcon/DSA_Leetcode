class Solution {
    public int findTheWinner(int n, int k) {
        if(n==1)
        {
            return n;
        }
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 1;i<=n;i++)
        {
            nums.add(i);
        }
        return helpWin(0,k,nums);

    }
    public int helpWin(int i,int k,ArrayList<Integer> nums) // i for pointer , k for adding , nums to modify list
    {
        if(nums.size() == 1)
        {
            return nums.get(0);
        }
        i = (i+(k-1))%nums.size();
        nums.remove(i);
        return helpWin(i,k,nums);
    }
}