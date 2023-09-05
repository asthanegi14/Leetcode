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
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static void dfs(char[][] a, int n, int m, int i, int j){
        if(i<0 || i>=n || j>=m || j<0 || a[i][j]!='O') {
            return;
        }
        
        a[i][j] = '*';
        dfs(a, n, m, i+1, j);
        dfs(a, n, m, i-1, j);
        dfs(a, n, m, i, j+1);
        dfs(a, n, m, i, j-1);
    }
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        for(int i=0;i<n;i++){
            if(a[i][0]=='O'){
                dfs(a, n, m, i, 0);
            }
            if(a[i][m-1]=='O'){
                dfs(a, n, m, i, m-1);
            }
        }
        
        for(int i=0;i<m;i++){
            if(a[0][i]=='O'){
                dfs(a, n, m, 0, i);
            }
            if(a[n-1][i]=='O'){
                dfs(a, n, m, n-1, i);
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]=='*'){
                    a[i][j]='O';
                }
                else if(a[i][j]=='O'){
                    a[i][j]='X';
                }
            }
        }
        return a;
    }
}