class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        if(nums[0]==0){
            return false;
        }
        int j = 0, max = 0;
        for(int i=0;i<nums.length;i++){
            if(i>max){
                return false;
            }
            j+=nums[i];
            max = Math.max(max,j+i);
            j=0;
        }
        return max>=nums.length-1;
    }
}
