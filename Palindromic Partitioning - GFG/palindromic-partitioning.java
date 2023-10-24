//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean isPlaindrome(String s){
        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
    static int find(String s, int i, int[] dp){
        if(i==s.length()){
            return 0;
        }
        if(dp[i]!=0){
            return dp[i];
        }
        String temp = "";
        int min = Integer.MAX_VALUE;
        for(int j=i;j<s.length();j++){
            temp += s.charAt(j);
            if(isPlaindrome(temp)){
                int cost = 1+find(s, j+1, dp);
                min = Math.min(min, cost);
            }
        }
        
        return dp[i] = min;
    }
    static int palindromicPartition(String str)
    {
        // code here
        int n = str.length();
        int[] dp = new int[n];
        return find(str, 0, dp)-1;
    }
}