class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans = ans^nums[i];
        }
        for(int i=0;i<=nums.length;i++){
            ans = ans^i;
        }
        
        return ans;
    }
}