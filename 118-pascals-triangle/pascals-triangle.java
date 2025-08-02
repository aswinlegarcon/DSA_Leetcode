class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> temp = new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            temp.add(pascal(i));
        }
    return temp;
    }

        private List<Integer> pascal(int row)
        {
            List<Integer> temp = new ArrayList<>();
            int ans = 1;
            temp.add(ans);

            
            for(int i=1;i<row;i++)
            {


                ans = ans * (row-i) / i;
                temp.add(ans);
            }

            return temp;


        }
    
}