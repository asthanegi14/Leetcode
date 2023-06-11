class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<=2){
            return -1;
        }
        else{
            return nums[1];
        }
    }
}
