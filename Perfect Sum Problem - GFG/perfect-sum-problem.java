//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{
    // public void find(int[] arr, int sum, int i, List<Integer> a, List<List<Integer>> ans){
    //     if(i==arr.length){
    //         if(sum==0){
    //             ans.add(a);
    //         }
    //         return;
    //     }
    //     a.add(arr[i]);
    //     find(arr, sum-arr[i], i+1, a, ans);
    //     a.remove(a.size()-1);
    //     find(arr, sum, i+1, a, ans);
    // }
	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
	   // List<List<Integer>> ans = new ArrayList<>();
	   // find(arr, sum, 0, new ArrayList<>(), ans);
	    
	   //// System.out.println(ans);
	    
	   // return ans.size();
	   int mod = 1000000007;
	   int[][] dp = new int[n+1][sum+1];
	   dp[0][0]=1;
	   
	   for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                int ans = dp[i-1][j];
                
                if(j-arr[i-1]>=0){
                    ans+=dp[i-1][j-arr[i-1]];
                }
                dp[i][j]=ans%mod;
            }
        }
        
	   return dp[n][sum];
	} 
}