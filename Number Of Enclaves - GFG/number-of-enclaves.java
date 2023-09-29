//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                s = in.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[j]);
                }
            }
            Solution ob = new Solution();
            out.println(ob.numberOfEnclaves(a));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    void find(int i, int j, int[][] a){
        if(i<0 || j<0 || i>=a.length || j>=a[0].length || a[i][j]==0 || a[i][j]==-1){
            return;
        }
        
        a[i][j]=-1;
        find(i+1, j, a);
        find(i, j+1, a);
        find(i-1, j, a);
        find(i, j-1, a);
    }
    int numberOfEnclaves(int[][] grid) {
        // Your code here
        int n=grid.length, m=grid[0].length;
        
        for(int i=0;i<m;i++){
            if(grid[0][i]==1){
                find(0, i, grid);
            }
            if(grid[n-1][i]==1){
                find(n-1, i, grid);
            }
        }
        for(int i=0;i<n;i++){
            if(grid[i][0]==1){
                find(i, 0, grid);
            }
            if(grid[i][m-1]==1){
                find(i, m-1, grid);
            }
        }
        
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    ans++;
                }
            }
        }
        
        return ans;
    }
}