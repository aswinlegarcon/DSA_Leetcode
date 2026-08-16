class Solution {
    public String clearStars(String s) {
        PriorityQueue<Character> pq = new PriorityQueue<>();
        int n = s.length();
        boolean[] toAdd = new boolean[n];
        HashMap<Character,Deque<Integer>> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(int i=0;i<n;i++)
        {
            char c = arr[i];
            if(c == '*')
            {
                char small = pq.poll();
                int indOfSmall = map.get(small).removeLast();
                toAdd[i] = false;
                toAdd[indOfSmall] = false;
            }
            else
            {
                pq.add(c);
                map.putIfAbsent(c, new ArrayDeque<>());
                map.get(c).add(i);
                toAdd[i] = true;
            }
        } 
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(toAdd[i]) ans.append(""+arr[i]);
        }
        return ans.toString();
    }
}