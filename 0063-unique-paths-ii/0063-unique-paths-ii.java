class Solution {
    public int find(int i, int j, int[][] a, int count, int[][] dp){
        if(i>=a.length || j>=a[0].length || a[i][j] == 1){
            return 0;
        }
        if(i==a.length-1 && j==a[0].length-1){
            if(a[i][j]==1){
                return 0;
            }
            return 1;
        }
        if(dp[i][j]>0){
            return dp[i][j];
        }
        return dp[i][j] = find(i, j+1, a, count, dp)+find(i+1, j, a, count, dp);
    }
    public int uniquePathsWithObstacles(int[][] a) {
        int[][] dp=new int[a.length][a[0].length];
        return find(0, 0, a, 0, dp);
    }
}