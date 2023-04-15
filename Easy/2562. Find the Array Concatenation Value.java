class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i=0, j=nums.length-1;
        long ans = 0;
        while(i<j){
            String con = String.valueOf(nums[i++])+String.valueOf(nums[j--]);
            ans+=Long.valueOf(con);
        }
        if(nums.length%2!=0){
            ans+=Long.valueOf(nums[i]);
        }
        return ans;
    }
}
