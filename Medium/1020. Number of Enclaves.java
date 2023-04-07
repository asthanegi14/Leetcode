class Solution {
    public void dfs(int[][] g, int i, int j){
        g[i][j]=0;
        System.out.println(i+" "+j);
        int[] x = {1,-1,0,0};
        int[] y = {0,0,1,-1};

        for(int k=0;k<4;k++){
            int newx = x[k]+i;
            int newy = y[k]+j;

            if(newx>=0 && newy>=0 && newx<g.length && newy<g[0].length && g[newx][newy]==1){
                dfs(g, newx, newy);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int n = grid.length, m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==0 || j==0 || i==n-1 || j==m-1) && grid[i][j]==1){
                    dfs(grid, i, j);
                }
            }
        }
        int count=0;
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}
