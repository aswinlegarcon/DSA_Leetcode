class Solution {
    public int longestBalanced(String s) {
        int max = 0;
        int n = s.length();
        char arr[] = s.toCharArray();
        for(int i=0;i<n;i++)
        {
            int hash[] = new int[26];
            for(int j=i;j<n;j++)
            {
                hash[arr[j]-'a']++;
                int cnt = 0;
                int k = 0;
                while(k<26)
                {
                    if(hash[k] > 0) {
                        cnt = hash[k];
                        break;
                    }
                    else{
                        k++;
                    }
                }
                boolean check = false;
                for(k=k;k<26;k++)
                {
                    if(hash[k]!=0 && hash[k]!=cnt)
                    {
                        check = true;
                        break;
                    }
                }
                if(!check)
                {
                    max = Math.max(j-i+1,max);
                }
            }
        }
        return max;
    }
}