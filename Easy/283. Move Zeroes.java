class Solution {
    public void moveZeroes(int[] nums) {
        int k=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k++]=nums[i];
                count++;
            }
        }
        for(int i=count;i<nums.length;i++){
            nums[k++]=0;
        }
    }
}
