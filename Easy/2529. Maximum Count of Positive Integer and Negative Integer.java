class Solution {
    public int maximumCount(int[] nums) {
        int i=0, j=nums.length-1;
        int pos=0, neg=0;

        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid]>0){
                pos = nums.length-mid;
                j = mid-1;
            }
            if(nums[mid]<=0){
                i = mid+1;
            }
        }

        i=0; j=nums.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid]<0){
                neg=mid+1;
                i = mid+1;
            }
            if(nums[mid]>=0){
                j = mid-1;
            }
        }
        return Math.max(pos, neg);
    }
}
