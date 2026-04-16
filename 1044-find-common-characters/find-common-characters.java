class Solution {
    public List<String> commonChars(String[] words) {
        int n = words.length;
        List<String> ans = new ArrayList<>();
        int cnt[] = countFreq(words[0]);

        for(int i=1;i<words.length;i++)
        {
            cnt = updateFreq(cnt,countFreq(words[i]));
        }


        for(int i=0;i<26;i++)
        {
            if(cnt[i]==0) continue;

            char temp = (char) (i + 'a');
            while(cnt[i]>0)
            {
                ans.add(""+temp);
                cnt[i]--;
            }
        }
        return ans;
    }

    private int[] updateFreq(int arr1[],int arr2[])
    {
        int ans[] = new int[26];
        for(int i=0;i<26;i++)
        {
            ans[i] = Math.min(arr1[i],arr2[i]);
        }
        return ans;
    }

    private int[] countFreq(String word)
    {
        int count[] = new int[26];
        char arr[] = word.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            count[(arr[i]-'a')]++;
        }
        return count;
    }
}