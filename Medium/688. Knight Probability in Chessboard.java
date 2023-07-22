class Solution {
    double[][][] dp;
    int[] x = {-2, -2, -1, -1, 1, 1, 2, 2};
    int[] y = {-1, 1, -2, 2, -2, 2, -1, 1};

    public double find(int r, int c, int n, int k){
        if(r<0 || c<0 || r>=n ||c>=n){
            return 0;
        }
        if(k==0){
            return 1;
        }
        if(dp[r][c][k] != -1.0){
            return dp[r][c][k];
        }

        double ans=0;

        for(int i=0;i<8;i++){
            ans+=find(r+x[i], c+y[i], n, k-1);
        }

        return dp[r][c][k] = ans;
    }
    public double knightProbability(int n, int k, int row, int col) {
        dp = new double[n][n][k+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Arrays.fill(dp[i][j], -1.0);
            }
        }
        double fav = find(row, col, n, k);
        double total = Math.pow(8, k);
        return fav/total;
    }
}
