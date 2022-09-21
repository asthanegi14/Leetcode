class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0,n=nums.length-1;
        while(i<n){
            int mid = i+(n-i)/2;
            if((mid%2==0 &&  nums[mid]==nums[mid+1]) || (mid%2==1 && nums[mid]==nums[mid-1])){
                i=mid+1;
            }
            else{
                n=mid;
            }
        }
        return nums[i];
    }
}
