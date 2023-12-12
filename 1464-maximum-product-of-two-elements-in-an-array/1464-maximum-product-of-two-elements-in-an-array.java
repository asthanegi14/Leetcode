class Solution {
    public int maxProduct(int[] nums) {
        int ans=0;
        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                ans = Math.max(ans, (nums[i]-1) * (nums[j]-1));
            }
        }
        return ans;
    }
}