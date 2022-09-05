class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]-min);
        }
        if(max==0){return -1;}
        else
        return max;
    }
}
