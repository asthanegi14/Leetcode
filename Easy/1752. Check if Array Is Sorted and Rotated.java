class Solution {
    public boolean check(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            int idx = (i+1)%nums.length;
            if(nums[idx]<nums[i]){
                n++;
            }
        }

        return n<=1;
    }
}
