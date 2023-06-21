class Solution {
    long find(int[] nums, int[] cost, long min){
        long ans = 0;
        for(int i=0;i<nums.length;i++){
            ans+=Math.abs(nums[i]-min)*cost[i];
        }
        return ans;
    }
    public long minCost(int[] nums, int[] cost) {
        long min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i:nums){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        long ans = find(nums, cost, min);
        while(min<max){
            long mid = (min+max)/2;
            long l = find(nums, cost, mid);
            long r = find(nums, cost, mid+1);

            ans=Math.min(l, r);
            if(l<r){
                max = mid;
            }
            else{
                min = mid+1;
            }
        }
        return ans;
    }
}
