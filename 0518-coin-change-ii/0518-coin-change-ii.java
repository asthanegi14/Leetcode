class Solution {
    public int find(int k, int[] a, int n, int[][] dp){
        if(n==0){
            return k%a[0]==0?1:0;
        }
        if(dp[n][k]!=-1){
            return dp[n][k];
        }
        
        int notTake = find(k, a, n-1, dp);
        int take = 0;
        if(a[n]<=k){
            take = find(k-a[n], a, n, dp);
        }
        return dp[n][k] = take+notTake;
    }
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] i:dp){
            Arrays.fill(i, -1);
        }
        return find(amount, coins, coins.length-1, dp);
    }
}