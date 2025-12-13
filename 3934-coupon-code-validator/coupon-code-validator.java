class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        ArrayList<String> elect = new ArrayList<>();
        ArrayList<String> groc = new ArrayList<>();
        ArrayList<String> pharm = new ArrayList<>();
        ArrayList<String> rest = new ArrayList<>();

        for(int i=0;i<code.length;i++)
        {
            if(isActive[i])
            {
                if(businessLine[i].equals("electronics") || 
                businessLine[i].equals("grocery") ||
                businessLine[i].equals("pharmacy") || 
                businessLine[i].equals("restaurant") )
                {
                    String token = code[i];
                    if(token.length()==0) continue;
                    boolean check = false;
                    for(int j=0;j<token.length();j++)
                    {
                        char c = token.charAt(j);
                        if(!Character.isLetterOrDigit(c) && c != '_')
                        {
                            check = true;
                            break;
                        }
                    }
                    if(!check)
                    {
                        if(businessLine[i].charAt(0)=='e') elect.add(token);
                        if(businessLine[i].charAt(0)=='g') groc.add(token);
                        if(businessLine[i].charAt(0)=='p') pharm.add(token);
                        if(businessLine[i].charAt(0)=='r') rest.add(token);
                    }
                }
            }
        }
        Collections.sort(elect);
        Collections.sort(groc);
        Collections.sort(pharm);
        Collections.sort(rest);

        List<String> ans = new ArrayList<>();
        ans.addAll(elect);
        ans.addAll(groc);
        ans.addAll(pharm);
        ans.addAll(rest);

        return ans;
    }
}