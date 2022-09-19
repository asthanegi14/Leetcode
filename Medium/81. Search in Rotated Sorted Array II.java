class Solution {
    public boolean search(int[] nums, int target) {
        int i=0,n=nums.length-1;
        while(i<=n){
            int mid=i+(n-i)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[mid]==nums[n]){n--;}
           
            else if(nums[mid]<nums[n]){
                if(nums[mid]<target && nums[n]>=target){
                    i=mid+1;
                }
                else
                    n=mid-1;
            }
            else{
                if(nums[i]<=target && nums[mid]>target){
                    n=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
        }
        return false;
    }
}
