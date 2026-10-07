class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0;
        int j = 0;
        for(int k=0;k<commands.size();k++)
        {
            String command = commands.get(k);
            if(command.equals("UP")){
                i--;
            }
            else if(command.equals("DOWN")){
                i++;
            }
            else if(command.equals("LEFT")){
                j--;
            }
            else{
                j++;
            }
        }
        return (i*n) + j;

    }
}