class Solution {
    public int majorityElement(int[] nums) {
        int ans=0,count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[ans]==nums[i])
                count++;
            else
                count--;
            if(count==0){
                ans=i;
                count++;
            }
        }
        return nums[ans];
    }
}
