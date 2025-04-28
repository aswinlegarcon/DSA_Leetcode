class Solution {

    public void solve(String s,int target,List<String> ans,String path,
    int i,long res,long prev)
    {
        if(i==s.length())
        {
            if(res==target) ans.add(path);
            return;
        }

        for(int j=i;j<s.length();j++)
        {
            if(j>i && s.charAt(i)=='0')
            {
                break;
            }
            long num = Long.parseLong(s.substring(i,j+1));
            if(i==0)
            {
                solve(s,target,ans,path+num,j+1,num,num);
            }
            else
            {
                solve(s,target,ans,path+"+"+num,j+1,res+num,num);
                solve(s,target,ans,path+"-"+num,j+1,res-num,-num);
                solve(s,target,ans,path+"*"+num,j+1,res-prev+prev*num,prev*num);
            }
        }
    }
    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();
        solve(num,target,ans,"",0,0,0);
        return ans;
    }
}