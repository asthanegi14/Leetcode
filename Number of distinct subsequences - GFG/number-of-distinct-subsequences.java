//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.distinctSubsequences(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int distinctSubsequences(String S) {
        // code here
        int mod = 1000000007;
        int n = S.length();
        long[] dp = new long[n+1];
        
        dp[0] = 1;
        int[] fre = new int[26];
        Arrays.fill(fre, -1);
        
        for(int i=1;i<=n;i++){
            dp[i] = (dp[i-1]*2)%mod;
            
            int j = S.charAt(i-1)-'a';
            
            if(fre[j]!=-1){
                dp[i] -= dp[fre[j]-1];
                dp[i] = (dp[i] + mod)%mod;
            }
            fre[j] = i;
        }
        
        return (int) (dp[n]%mod);
    }
}