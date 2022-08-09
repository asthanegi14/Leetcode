class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] ans = new int[target+1];
        
        ans[0]=1;
        for(int i=1;i<=target;i++){
            for(int j=0;j<nums.length;j++){
                if(i-nums[j]>=0){
                    ans[i]+=ans[i-nums[j]];
                }
            }
        }
        return ans[target];
    }
}
