class Solution {
    public int candy(int[] ratings) {
        int sum = 1;
        int i = 1;
        int n = ratings.length;

        while(i<n)
        {
            if(ratings[i]==ratings[i-1])
            {
                i++;
                sum += 1;
                continue;
            }
            int peak = 1;
            while(i<n && ratings[i]>ratings[i-1])
            {
                peak++; // here we add and go upward because sum is 1 on starting
                sum += peak;
                i++;
            }
            int down = 1;
            while(i<n && ratings[i]<ratings[i-1])
            {
                sum += down; // here we need to add the 1 also then only we need to increase it
                down++;
                i++;
            }

            if(down>peak)
            {
                sum += down - peak;
            }

        }
        return sum;
    }
}