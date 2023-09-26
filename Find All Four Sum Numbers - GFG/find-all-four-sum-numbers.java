//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        int n = arr.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        
        for(int i=0;i<n-3;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }    
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && arr[j]==arr[j-1]){
                    continue;
                }
                for(int l=j+1;l<n-1;l++){
                    if(l>j+1 && arr[l]==arr[l-1]){
                        continue;
                    }
                    for(int m=l+1;m<n;m++){
                        if(m>l+1 && arr[m]==arr[m-1]){
                            continue;
                        }
                        
                        int sum = arr[i]+arr[j]+arr[l]+arr[m];
                        
                        if(sum==k){
                            ArrayList<Integer> a = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[l], arr[m]));
                            ans.add(a);
                        }
                    }
                }
            }
        }
        
        return ans;
    }
}