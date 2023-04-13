class Solution {
    public int minOperations(int[] nums) {
        int max = Integer.MIN_VALUE;
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                int diff = nums[i-1]-nums[i];
            // System.out.print("diff= "+diff);
                nums[i]+=diff+1;
                ans+=diff+1;
            }
            else if(nums[i]==nums[i-1]){
                nums[i]=nums[i]+1;
                ans+=1;
            }
        }
        // for(int i=0;i<nums.length;i++){
        //     System.out.print(nums[i]+" ");
        // }
        return ans;
    }
}
