class Solution {
    public boolean find(int[] nums, int i, int[] dp){
        if(i==nums.length){
            return true;
        }
        if(dp[i]!=0){
            return dp[i]==1?true:false;
        }
        if(i+1<nums.length && nums[i]==nums[i+1]){
            if(find(nums, i+2, dp)){
                dp[i]=1;
                return true;
            } 
            
            if(i+2<nums.length && nums[i]==nums[i+2]){
                if(find(nums, i+3, dp)){
                    dp[i]=1;
                    return true;
                } 
            }
        }
        
        if(i+2<nums.length && nums[i+1]-nums[i]==1 && nums[i+2]-nums[i+1]==1){
            if(find(nums, i+3, dp)){
                dp[i]=1;
                return true;
            } 
        }
        dp[i]=-1;
        return false;
    }
    public boolean validPartition(int[] nums) {
        
        if(nums.length==2){
            return nums[0]==nums[1];
        }
        int[] dp = new int[nums.length];
        return find(nums, 0, dp);
    }
}