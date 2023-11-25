class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] ans = new int[nums.length];
        
        // for(int i=0;i<nums.length;i++){
        //         int sum = 0;
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j){
        //             sum+=Math.abs(nums[i]-nums[j]);
        //         }
        //     }
        //     ans[i] = sum;
        // }
        int psum=0;
        for(int i=0;i<nums.length;i++){
            psum+=nums[i];
        }
        int sum = 0;
        
        for(int i=0;i<nums.length;i++){
            psum-=nums[i];
            ans[i] = psum - sum - (nums.length-2*i-1)*nums[i];
            sum+=nums[i];
        }
        return ans;
    }
}