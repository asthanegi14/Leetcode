class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int sum=0, max = Integer.MIN_VALUE;
        int i=0, j=1, k=2;
        while(i<nums.length && j<nums.length && k<nums.length){
            if(nums[i]+nums[j]>nums[k]){
                sum=nums[i]+nums[j]+nums[k];
                max = Math.max(max, sum);
            }
            i++; j++; k++;
        }

        return max==Integer.MIN_VALUE?0:max;
    }
}
