class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        int k=0;
        for(int i=1;i<size;i++)
        {
            if(nums[i]!=nums[k])
            { 
                k++;
                nums[k]=nums[i];
            }
        }
        return k+1;
    }
}
