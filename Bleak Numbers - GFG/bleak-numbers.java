//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.is_bleak(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int count(int i){
        int c=0;
        while(i>0){
            c+=i&1;
            i>>=1;
        }
        return c;
    }
    public int is_bleak(int n)
    {
        // Code here
        int max = (int)Math.ceil(Math.log(n) / Math.log(2));
        int x = Math.max(1, n - max * 2);

        for (int i = x; i <= n; i++) {
            if (i + count(i) == n) {
                return 0;
            }
        }
        return 1; 
    }
}