class Solution {
    public int find(int[] days, int[] cost, int i, int[] dp){
        if(i>=days.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }

        int one=0, svn=0, last=0;
        one = cost[0] + find(days, cost, i+1, dp);

        for(int j=i;j<days.length && days[j]<days[i]+7; j++){
            svn = cost[1] + find(days, cost, j+1, dp);
        }

        for(int j=i;j<days.length && days[j]<days[i]+30; j++){
            last = cost[2] + find(days, cost, j+1, dp);
        }
        
        dp[i] = Math.min(one, Math.min(svn,last));
        return dp[i];
    }
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days.length];
        Arrays.fill(dp,-1);
        return find(days, costs, 0, dp);
    }
}
