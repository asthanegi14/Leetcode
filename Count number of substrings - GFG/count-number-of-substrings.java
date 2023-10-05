//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int k = sc.nextInt();
    		System.out.println (new Solution().substrCount (s, k));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    long find(String s, int k){
        int[] a = new int[26];
        int dit=0, l=0;
        long ans=0;
        
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
            if(a[s.charAt(i)-'a']==1){
                dit++;
            }
            
            while(dit>k){
                a[s.charAt(l)-'a']--;
                
                if(a[s.charAt(l)-'a']==0){
                    dit--;
                }
                l++;
            }
            
            ans = ans+(i-l+1);
        }
        return ans;
    }
    long substrCount (String S, int K) {
        // your code here
        return find(S, K)-find(S, K-1);
    }
}