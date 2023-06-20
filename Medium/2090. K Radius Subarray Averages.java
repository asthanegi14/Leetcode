class Solution {
    public int[] getAverages(int[] nums, int k) {
        if(k==0){
            return nums;
        }
        int[] ans = new int[nums.length];
        long[] sumArr = new long[nums.length];
        sumArr[0] = nums[0];

        for(int i=1;i<nums.length;i++){
            sumArr[i] = sumArr[i-1]+nums[i];
        }
        Arrays.fill(ans, -1);

        for(int i=k;i<nums.length-k;i++){
            long sum = (sumArr[i+k]-sumArr[i-k]+nums[i-k])/(k*2+1);
            ans[i] = (int) sum;
        }
        return ans;
    }
}
