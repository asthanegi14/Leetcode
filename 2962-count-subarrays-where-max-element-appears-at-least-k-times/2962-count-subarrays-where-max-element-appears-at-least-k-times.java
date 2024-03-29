class Solution {
    public long countSubarrays(int[] nums, int k) {
        long ans=0;
        int i=0, j=0, max=0, count=0;
        
        while(i<nums.length){
            max = Math.max(max, nums[i]);
            i++;
        }
        i=0;
        
        while(i<nums.length){
            if(nums[i]==max){
                count++;
            }
            
            while(count>=k){
                if(nums[j]==max){
                    count--;
                }
                j++;
                ans += nums.length-i;
            }
            i++;
        }
        
        return ans;
    }
}