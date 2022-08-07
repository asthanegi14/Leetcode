class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        boolean vis[][]=new boolean[m][n];

        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(vis[i][j]==false && grid[i][j]=='1')
                {
                    count++;
                    dfs(grid,vis,i,j);
                }
                
            }
        }
        return count;
    }
    void dfs(char grid[][],boolean vis[][],int i,int j)
    {
        int m = grid.length;
        int n = grid[0].length;
        if(i<0 || j<0 || i>=m || j>=n) //out of bound values
        {
            return ;
        }
        if(vis[i][j]==true || grid[i][j]=='0')
        {
            return;
        }
            vis[i][j]=true;     
            grid[i][j]='0';
            dfs(grid,vis,i+1,j);  
            dfs(grid,vis,i-1,j);
            dfs(grid,vis,i,j+1);
            dfs(grid,vis,i,j-1);
           
    }
}
