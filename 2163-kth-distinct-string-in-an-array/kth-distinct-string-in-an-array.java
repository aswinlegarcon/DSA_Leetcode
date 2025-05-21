class Solution {
    public String kthDistinct(String[] arr, int k) {
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            boolean check = false;
            for(int j=0;j<arr.length;j++)
            {
                if(j==i) continue;
                if(arr[j].equals(arr[i]))
                {
                    check = true;
                }
            }
            if(!check) ans.add(arr[i]);
        }

        return ans.size()>k-1?ans.get(k-1):"";

    }
}