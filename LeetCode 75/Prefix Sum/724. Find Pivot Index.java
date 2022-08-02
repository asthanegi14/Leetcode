class Solution {
    public int pivotIndex(int[] nums) {
        int i=0,n=nums.length;
        int sum1=0,sum2=0;
        for(int j=0;j<n;j++)
        {
            sum1 += nums[j];
        }
        for(int j=0;j<n;j++)
        {
            sum1 -= nums[j];
            if(sum1 == sum2){
                return j;
            }
            sum2 += nums[j];
        }
        return -1;
    }
}
