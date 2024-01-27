class Solution {
    int mod = 1000000007;
    public int find(int n, int k, Integer[][] dp){
        if(n==0){return 0;}
        
        if(k==0){return 1;}
        
        if(dp[n][k]!=null){
            return dp[n][k];
        }
        int ans=0;
        
        for(int i=0;i<=Math.min(k, n-1);i++){
            ans += find(n-1, k-i, dp);
            ans%=mod;
        }
        
        return dp[n][k] = ans;
    }
    public int kInversePairs(int n, int k) {
        Integer[][] dp = new Integer[n+1][k+1];
        return find(n, k, dp);
    }
}