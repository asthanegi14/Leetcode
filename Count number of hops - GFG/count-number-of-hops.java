//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG implements Runnable {
    public void run() {
        try {
            BufferedReader in;
            PrintWriter out;
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(in.readLine().trim());

                Solution g = new Solution();
                out.println(g.countWays(n));
            }
            out.close();
        } catch (Exception e) {
            ;
        }
    }

    public static void main(String args[]) throws IOException {
        new Thread(null, new GFG(), "whatever", 1 << 26).start();
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long find(int n, int mod, int[] dp){
        // System.out.println("i="+i);
        if(n<=2){
            return n;
        }
        if(n==3){
            return 4;
        }
        
        //recursive TLE
        // if(i==n){
        //     return 1;
        // }
        // if(i>n){
        //     return 0;
        // }
        int count=0;
        // count+=find(n, i+1, mod);
        // count+=find(n, i+2, mod);
        // count+=find(n, i+3, mod);
        // return count%mod;
        
        //DP
        if(dp[n]!=-1){
            return dp[n]; 
        }
        
        count+=((find(n-1, mod, dp)+find(n-2, mod, dp))%mod+find(n-3, mod, dp));
        
        dp[n]=count%mod;
        
        return dp[n];
    }
    static long countWays(int n)
    {
        // add your code here
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int mod = 1000000007;
        return find(n, mod, dp);
    }
    
}

