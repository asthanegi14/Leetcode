//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String[] element = br.readLine().split(" ");
		    int N = Integer.parseInt(element[0]);
		    int M = Integer.parseInt(element[1]);
		    int arr [] = new int[N];
		    int brr [] = new int[M];
		    String[] elements = br.readLine().split(" ");
		    for(int i=0; i<N; i++)
		        arr[i] = Integer.parseInt(elements[i]);
		        
		    String[] ele = br.readLine().split(" ");
		    for(int i=0; i<M; i++)
		        brr[i] = Integer.parseInt(ele[i]);
		    
		    int X = Integer.parseInt(br.readLine());
		    
		    Solution obj = new Solution();
		    ArrayList<Integer> ans;
		    ans = obj.printClosest(arr, brr, N, M, X);
		    System.out.println(Math.abs(ans.get(0) + ans.get(1) - X));
		}
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        // int min=Integer.MAX_VALUE, a=0, b=0;;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         int sum=brr[j]+arr[i];
        //         if(min>Math.abs(sum-x)){
        //             min = Math.abs(sum-x);
        //             a = brr[j];
        //             b = arr[i];
                    
        //             // System.out.println("sum="+sum+" min="+min);
        //         }
        //     }
        // }
        // ans.add(a);
        // ans.add(b);
        
        int i=0, j=m-1;
        int dif = Integer.MAX_VALUE;
        
        while(i<n && j>=0){
            int sum = arr[i]+brr[j];
            // if(x-sum==0){
            //     // ans.add(arr[i]);
            //     // ans.add(brr[j]);
            //     return ans;
            // }
            
            if(dif>Math.abs(sum-x)){
                ans.clear();
                dif = Math.abs(sum-x);
                ans.add(arr[i]);
                ans.add(brr[j]);
            }
            if(x-sum>0){
                i++;
            }
            else{
                j--;
            }
            // System.out.println(ans+" i="+i+" j="+j+" sum="+sum);
        }
        return ans;
    }
}