class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0, j=0, n=nums.length;
        int sum=0, min=Integer.MAX_VALUE;
        while(i<n){
            sum+=nums[i];
            if(sum>=target){
                while(sum>=target){
                    min = Math.min(min, i-j+1);
                    sum-=nums[j];
                    j++;
                }
            }
            i++;
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}
