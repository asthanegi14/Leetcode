class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int n = Math.abs(nums[i]);
            int sq = n*n;
            
            nums[i] = sq;
        }
        
        Arrays.sort(nums);
        return nums;
    }
}