//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    //taking total number of elements
		    int n=sc.nextInt();
		    
		    //calling printFibb() method
		    long[] res = new Solution().printFibb(n);
		    
		    //printing the elements of the array
		    for (int i = 0; i < res.length; i++)
		        System.out.print (res[i]+" ");
		    System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return list containing first n fibonacci numbers.
    
    public static void find(long[] ans, int i, int n){
        if(i>=n){
            return;
        }
        if(i==0 || i==1){
            ans[i] = 1;
        }
        if(i>=2){
            ans[i] = ans[i-1]+ans[i-2];
        }
        find(ans, i+1, n);
    }
    public static long[] printFibb(int n) 
    {
        //Your code here
        long[] ans = new long[n];
        find(ans, 0, n);
        
        return ans;
    }
}