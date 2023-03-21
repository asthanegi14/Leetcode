class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0, ans=0;
        int j=-1;
        for(int i=0;i<nums.length;i++){
            count=0;
            if(nums[i]==0){
                while(i<nums.length && nums[i]==0){
                    count++;
                    i++;
                }
            }
            ans+=(count*(count+1))/2;
        }
        return ans;
    }
}
