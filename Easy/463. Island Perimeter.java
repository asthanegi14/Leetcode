class Solution {
    public int dfs(int[][] g, int i, int j){
        if(i<0 || i>=g.length || j<0 || j>=g[0].length){
            return 1;
        }
        if(g[i][j]==0){
            return 1;
        }

        if(g[i][j]==-1){
            return 0;
        }
        int count=0;
        g[i][j]=-1;

        count+=dfs(g, i, j-1);
        count+=dfs(g, i-1, j);
        count+=dfs(g, i, j+1);
        count+=dfs(g, i+1, j);

        return count;
    }
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    count = dfs(grid, i, j);
                }
            }
        }
        return count;
    }
}
