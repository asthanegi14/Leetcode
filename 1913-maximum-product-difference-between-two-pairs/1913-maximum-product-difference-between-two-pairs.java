class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return Math.abs(nums[1]*nums[0]-nums[nums.length-1]*nums[nums.length-2]);
    }
}