class Solution {
    public int minPathSum(int[][] grid) {
        // return find(grid, 0, 0);
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];

        for(int i=1;i<grid[0].length;i++){
            dp[0][i] = grid[0][i]+dp[0][i-1];
        }
        
        for(int i=1;i<grid.length;i++){
            dp[i][0] = grid[i][0]+dp[i-1][0];
        }
        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j] , dp[i][j-1]);
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }

    //TLE 25 / 61 
    // public int find(int[][] g, int a, int b){
    //     if(a>=g.length || b>=g[0].length){
    //         return Integer.MAX_VALUE;
    //     }
    //     if(a==g.length-1 && b==g[0].length-1){
    //         return g[g.length-1][g[0].length-1];
    //     }

    //     return g[a][b] + Math.min(find(g, a+1, b), find(g, a, b+1));
    // }
}
