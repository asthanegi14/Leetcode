class Solution {
    int dfs(int[][] grid,int i,int j)
    {
        int r = grid.length;
        int c = grid[0].length;
        
        if(j<0 || i<0 || i>=r || j>=c)
        {
            return 0;
        }
        if(grid[i][j]==0)
        {
            return 0;
        }
        grid[i][j]=0;
        
        return 1+dfs(grid,i+1,j) + dfs(grid,i,j+1) + dfs(grid,i-1,j) + dfs(grid,i,j-1);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count=0;
        int res=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==1)
                {
                    res = dfs(grid,i,j);
                    count = Math.max(res,count);
                }
            }
        }
        return count;
    }
}
