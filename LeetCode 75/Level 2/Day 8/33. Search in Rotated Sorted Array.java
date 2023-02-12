class Solution {
    public int search(int[] nums, int target) {
        int i=0, n=nums.length-1;

        while(i<=n){
            int mid = i+(n-i)/2;

            if(nums[mid]==target){
                return mid;
            }

            if(nums[i]<=nums[mid]){
                if(target>=nums[i] && target<=nums[mid]){
                    n=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
            else{
                if(target>=nums[mid] && target<=nums[n]){
                    i=mid+1;
                }
                else{
                    n=mid-1;
                }
            }
        }
        return -1;
    }
}
