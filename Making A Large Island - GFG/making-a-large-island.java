//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntMatrix
{
    public static int[][] input(BufferedReader br, int n, int m) throws IOException
    {
        int[][] mat = new int[n][];

        for(int i = 0; i < n; i++)
        {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for(int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }

        return mat;
    }

    public static void print(int[][] m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }

    public static void print(ArrayList<ArrayList<Integer>> m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[][] grid = IntMatrix.input(br, n, n);
            
            Solution obj = new Solution();
            int res = obj.largestIsland(n, grid);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution{
    int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    
    public int dfs(int[][] g, int j, int k, int i){
        int n = g.length;
        if(j>=n || k>=n || j<0 || k<0 || g[j][k]!=1){
            return 0;
        }
        
        g[j][k] = i;
        int size = 1;
        
        for(int[] x:dir){
            int nj = j+x[0];
            int nk = k+x[1];
            
            if(nj>=0 && nj<n && nk>=0 && nk<n){
                size += dfs(g, nj, nk, i);
            }
        }
        return size;
    } 
    public int largestIsland(int N,int[][] grid) 
    {
        // code here
        int size=0;
        int i=2;
        int[] arr = new int[N*N+2];
        
        for(int j=0;j<N;j++){
            for(int k=0;k<N;k++){
                if(grid[j][k]==1){
                    arr[i] = dfs(grid, j, k, i);
                    size = Math.max(size, arr[i]);
                    i++;
                }
            }
        }
        
        for(int j=0;j<N;j++){
            for(int k=0;k<N;k++){
                if(grid[j][k] == 0){
                    HashSet<Integer> vis = new HashSet<>();
                    for(int [] x: dir){
                        int n_j = j+x[0];
                        int n_k = k+x[1];
                        
                        if(n_j>=0 && n_j<N && n_k>=0 && n_k<N){
                            if(grid[n_j][n_k]>1){
                                vis.add(grid[n_j][n_k]);
                            }
                        }
                    }
                    int y = 1;
                    for(int m:vis){
                        y+=arr[m];
                    }
                    size = Math.max(size, y);
                }
            }
        }
        return size;
    }
}
