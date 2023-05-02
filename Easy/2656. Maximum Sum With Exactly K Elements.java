class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        while(k-->0){
            ans+=nums[nums.length-1];
            nums[nums.length-1]++;
        }
        return ans;
    }
}
