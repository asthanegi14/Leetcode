class Solution {
    public int cal(int[] nums, int goal){
        int ans=0, sum=0, i=0, j=0;
     
        while(j<nums.length){
            // System.out.println("sum = "+sum+" i="+i+" j="+j);            
            sum+=nums[j];
            
            while(i<=j && sum>goal){
                sum-=nums[i];
                i++;
            }
            
            ans += j-i+1;
            j++;
        }
        return ans;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return cal(nums, goal) - cal(nums, goal-1);
    }
}