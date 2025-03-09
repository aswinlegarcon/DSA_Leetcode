class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> scores = new ArrayList<>();
        for(int i =0;i<operations.length;i++)
        {
            if(operations[i].equals("+"))
            {
                scores.add(scores.get(scores.size()-1) + scores.get(scores.size()-2));
            }
            else if(operations[i].equals("D"))
            {
                 scores.add(2 * scores.get(scores.size()-1));
            }
            else if(operations[i].equals("C"))
            {
                scores.remove(scores.size()-1);
            }
            else
            {
                scores.add(Integer.parseInt(operations[i]));
            }
        }

        int sum = 0;
        for(int num:scores)
        {
            sum += num;
        }
        return sum;
    }
}