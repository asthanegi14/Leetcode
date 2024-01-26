class Solution {
    int mod = 1000000007;
    public int find(int m, int n, int max, int r, int c, Integer[][][] dp){
        if(r<0 || r>=m || c<0 || c>=n){
            return 1;
        }
        if(max<=0){
            return 0;
        }
        
        if(dp[r][c][max]!=null){
            return dp[r][c][max];
        }
        int ans = 0;
        ans = (ans%mod+find(m, n, max-1, r-1, c, dp))%mod; 
        ans = (ans%mod+find(m, n, max-1, r+1, c, dp))%mod;
        ans = (ans%mod+find(m, n, max-1, r, c-1, dp))%mod;
        ans = (ans%mod+find(m, n, max-1, r, c+1, dp))%mod;
        
        dp[r][c][max] = ans%mod;
        
        return ans;
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        Integer[][][] dp = new Integer[m][n][maxMove+1];
        return find(m, n, maxMove, startRow, startColumn, dp);
    }
}