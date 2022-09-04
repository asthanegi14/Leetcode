class Solution {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE, x = 0;
        for(int i=0;i<nums.length;i++){
            x+=nums[i];
            
            if(sum<x){
                sum=x;
            }
            if(x<0){
                x=0;
            }
        }
        return sum;
    }
}
