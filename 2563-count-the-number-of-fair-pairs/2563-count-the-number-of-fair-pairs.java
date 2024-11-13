class Solution {
    public long find(int[] nums, int x){
        long ans=0;
        
        for(int i=0, j=nums.length-1;i<j;i++){
            while(i<j && nums[i]+nums[j]>x){
                j--;
            }
            
            ans += j-i;
        }
        
        return ans;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        
        return find(nums, upper) - find(nums, lower-1);
    }
}