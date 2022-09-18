class Solution {
    public int findPeakElement(int[] nums) {
        int i=0,n=nums.length-1,m=nums.length;
        
        while(i<n){
            int mid=i+(n-i)/2;
            if(mid==0){
                return nums[0]>=nums[1]?0:1;
            }
            if(mid==m-1){
                return nums[n-1]>=nums[n-2]?(n-1):(n-2);
            }
            if(nums[mid]>=nums[mid-1] && nums[mid]>=nums[mid+1]){
                return mid;
            }
            if(nums[mid]<nums[mid-1]){
                n=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return i;
    }
}
