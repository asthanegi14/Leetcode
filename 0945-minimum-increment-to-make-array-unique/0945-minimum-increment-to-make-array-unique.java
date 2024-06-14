class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        
        int ans=0, x=0;
        
        for(int i:nums){
            ans += Math.max(x-i, 0);
            x = Math.max(i, x)+1;
        }
        
        return ans;
    }
}