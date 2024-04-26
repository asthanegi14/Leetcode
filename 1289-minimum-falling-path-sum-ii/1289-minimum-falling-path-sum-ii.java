class Solution {
    public int find(int[][] a, int i, int j, Integer[][] dp){
        if(i<0 || i>=a.length || j<0 || j>=a.length){
            return 0;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        if(i==a.length-1){
            return a[i][j];
        }
        int sum = Integer.MAX_VALUE;
        
        for(int k=0;k<a.length;k++){
            if(k!=j){
                sum = Math.min(sum, find(a, i+1, k, dp));
            }
        }
        
        return dp[i][j] = sum+a[i][j];
    }
    public int minFallingPathSum(int[][] grid) {
        int ans=Integer.MAX_VALUE, n=grid.length;
        Integer[][] dp = new Integer[n][n];
        
        for(int i=0;i<n;i++){
            ans = Math.min(ans, find(grid, 0, i, dp)); 
        }
        return ans;
    }
}