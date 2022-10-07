class Solution {
    public int find(int mid, int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%mid==0){
                sum+=nums[i]/mid;
            }
            else{
                sum+=nums[i]/mid+1;
            }
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int t) {
        int max = Integer.MIN_VALUE;
        int low=1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }

        while(low<max){
            int mid = low+(max-low)/2;
            int s = find(mid,nums);
            if(s>t){
                low=mid+1;
            }
            else{
                max=mid;
            }
        }
        return low;
    }
}
