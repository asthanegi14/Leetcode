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
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int ans = ob.Count(matrix);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int  Count(int[][] matrix)
    {
        // code here
        int n=matrix.length, m=matrix[0].length;
        int count=0, z=0;
        
        int[][] dir = {{0, -1}, {-1, 0}, {-1, -1}, {-1, 1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==1){
                    z=0;
                    for(int[] k: dir){
                        int newi = i+k[0], newj = j+k[1];
                        if(newi>=0 && newi<n && newj>=0 && newj<m && matrix[newi][newj]==0){
                        // System.out.println("i="+newi+" j="+newj);
                            z++;
                        }
                    }
                    if(z!=0 && z%2==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}