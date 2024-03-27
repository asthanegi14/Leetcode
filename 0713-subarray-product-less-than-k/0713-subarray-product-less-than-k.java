class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int pro = 1, j=0, ans=0;
        
        for(int i=0;i<nums.length;i++){
            pro *= nums[i];
            
            while(j<=i && pro>=k){
                pro /= nums[j++];
            }
            ans += i-j+1;
        }
        
        return ans;
    }
}