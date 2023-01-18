class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int tempMax = 0;
        int arrSum = 0;
        int minSum = Integer.MAX_VALUE;
        int tempMin = 0;

        for(int i=0;i<nums.length;i++){
            arrSum += nums[i];
            tempMax += nums[i];
            maxSum = Math.max(tempMax,maxSum);
            if(tempMax<0){
                tempMax=0;
            }

            tempMin += nums[i];
            minSum = Math.min(tempMin,minSum);
            if(tempMin>0){
                tempMin=0;
            }
        }
        if(arrSum == minSum){
            return maxSum;
        }
        return Math.max(maxSum,(arrSum-minSum));
    }
}
