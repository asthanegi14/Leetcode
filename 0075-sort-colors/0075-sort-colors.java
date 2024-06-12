class Solution {
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int l=0, r=nums.length-1;
        
        for(int i=0;i<=r;){
            if(nums[i]==0){
                swap(nums, i++, l++);
            }
            else if(nums[i]==1){
                i++;
            }
            else{
                swap(nums, i, r--);
            }
        }
    }
}