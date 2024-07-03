class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<5){
            return 0;
        }
        
        int i=0, n=nums.length-4, ans=Integer.MAX_VALUE;
        
        while(n<nums.length){
            ans = Math.min(ans, nums[n]-nums[i]);
            i++; n++;
        }
        
        return ans;
    }
}