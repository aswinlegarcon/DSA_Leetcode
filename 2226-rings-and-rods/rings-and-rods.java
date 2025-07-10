class Solution {
    public int countPoints(String s) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<s.length();i+=2)
        {
            int index = s.charAt(i)=='R'? 0 : s.charAt(i)=='G' ? 1 : 2;
            int rod = s.charAt(i+1);
            if(map.get(rod)==null)
            {
                map.put(rod,new ArrayList<>(Arrays.asList(0,0,0)));
                map.get(rod).set(index,map.get(rod).get(index)+1);
            }
            else
            {
                map.get(rod).set(index,map.get(rod).get(index)+1);
            }
        }
        int count = 0;
        for(var list:map.keySet())
        {
            ArrayList<Integer> color = map.get(list);
            if(color.get(0)>=1 && color.get(1)>=1 && color.get(2)>=1) count++;
        }
        return count;
    }
}