class Solution {
    public int find(int[] nums, int i, int j, int turn){
        if(i==nums.length || j<0){
            return 0;
        }
        if(i>j){
            return 0;
        }
        if(turn==0){
            return Math.max(nums[i] + find(nums, i+1, j, 1), nums[j] + find(nums, i, j-1, 1));
        }
        else{
            return Math.min(-nums[i] + find(nums, i+1, j, 0), -nums[j] + find(nums, i, j-1, 0));
        }
    }
    public boolean PredictTheWinner(int[] nums) {
        int ret = find(nums, 0, nums.length-1, 0);
        return ret>=0;
    }
}