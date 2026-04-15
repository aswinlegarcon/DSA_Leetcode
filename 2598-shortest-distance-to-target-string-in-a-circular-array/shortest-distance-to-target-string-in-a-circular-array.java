class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int leftCnt = 0;
        boolean check = false;
        for(int i=0;i<n;i++)
        {
            String word = words[(startIndex-i+n)%n];
            if(word.equals(target))
            {
                check = true;
                break;
            }
            leftCnt++;
        }
        if(!check) return -1;
        int rightCnt = 0;
        for(int i=0;i<n;i++)
        {
            String word = words[(startIndex+i)%n];
            if(word.equals(target))
            {
                break;
            }
            rightCnt++;
        }
        return Math.min(leftCnt,rightCnt);
    }
}