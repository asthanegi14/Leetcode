class Solution {
    public boolean isValid(int mid, int[] nums){
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            if(sum > (long)mid*(1+i)){
                return false;
            }
        }
        return true;
    }
    public int minimizeArrayValue(int[] nums) {
        int i=0, j = Integer.MIN_VALUE;
        for(int k:nums){
            j = Math.max(j, k);
        }
        while(i<j){
            int mid = i+(j-i)/2;
            if(isValid(mid, nums)){
                j=mid;
            }
            else{
                i=mid+1;
            }
        }
        return i;
    }
}
