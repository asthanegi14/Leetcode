class Solution {
    public int find(int[] a, int i, int sum, int[] dp){
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int take = find(a, i-2, sum, dp)+a[i];
        int skip = find(a, i-1, sum, dp);
        dp[i] = Math.max(take, skip);
        
        return dp[i];
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return find(nums, nums.length-1, 0, dp);
    }
}