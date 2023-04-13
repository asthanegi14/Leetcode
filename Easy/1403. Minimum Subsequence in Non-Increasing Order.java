class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i:nums){
            sum+=i;
        }

        List<Integer> ans = new ArrayList<>();
        int curr = 0; 
        for(int i=nums.length-1;i>=0;i--){
            curr+=nums[i];
            ans.add(nums[i]);

            if(sum-curr<curr){
                return ans;
            }
        }
        return ans;
    }
}
