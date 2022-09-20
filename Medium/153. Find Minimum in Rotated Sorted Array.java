class Solution {
    public int findMin(int[] nums) {
        int i=0,n=nums.length-1,min=Integer.MAX_VALUE;
        while(i<=n){
            if(nums[i]<nums[n]){
                min=Math.min(min,nums[i]);
                break;
            }
            int mid=i+(n-i)/2;
            if(nums[mid]>=nums[i]){
                min=Math.min(min,nums[i]);
                i=mid+1;
            }
            else{
                min=Math.min(min,nums[mid]);
                n=mid-1;
            }
        }
        return min;
    }
}
