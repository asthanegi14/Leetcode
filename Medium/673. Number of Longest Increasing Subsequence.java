class Solution {
    public int findNumberOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int[] a = new int[nums.length];
        Arrays.fill(dp, 1);
        Arrays.fill(a, 1);

        int max = 1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i] && dp[j]+1>dp[i]){
                    dp[i] = dp[j]+1;
                    a[i] = a[j];
                }
                else if(nums[j]<nums[i] && dp[j]+1==dp[i]){
                    a[i] += a[j];
                }
                max=(int)Math.max(max, dp[i]);
            }
        }

        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(dp[i]==max){
                ans+=a[i];
            }
        }
        return ans;
    }
}
