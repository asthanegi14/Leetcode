class Solution {
    public void dfs(int[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0  || j>=grid[0].length || grid[i][j]==1){
            return;
        }
        grid[i][j]=1;
        int[] x = {1,-1,0,0};
        int[] y = {0,0,1,-1};

        for(int l=0;l<4;l++){
            int newx = i+x[l];
            int newy = j+y[l];

            dfs(grid, newx, newy);
        }
    }
    public int closedIsland(int[][] grid) {
        int count=0;
        int n = grid.length, m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==0 || j==0 || i==n-1 || j==m-1) && grid[i][j]==0){
                    dfs(grid, i, j);
                }
            }
        }
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                if(grid[i][j]==0){
                    dfs(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }
}
