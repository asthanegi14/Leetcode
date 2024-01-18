class Solution {
    public int find(int n, int i, int[] dp){
        if(i==n){
            return 1;
        }
        if(i>n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int ans=0;
        
        int o = find(n, i+1, dp);
        int t = find(n, i+2, dp);
        
        ans = o+t;
        dp[i] = ans;
        return dp[i];
    }
    public int climbStairs(int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return find(n, 0, dp);
    }
}