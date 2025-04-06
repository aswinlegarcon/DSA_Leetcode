//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            System.out.println(new Solution().countSubstr(s, k));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int countSubstr(String s, int k)
    {
        // your code here
        return countDist(s,k) - countDist(s,k-1);
    }
    
    private int countDist(String s,int k)
    {
        int count = 0;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        while(r<n)
        {
            char input = s.charAt(r);
            map.put(input,map.getOrDefault(input,0)+1);
            
            while(map.size() > k)
            {
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l)) == 0)
                {
                    map.remove(s.charAt(l));
                }
                l++;
            }
            
            count += r - l + 1;
            r++;
        }
                
                
        
        return count;
    }
}