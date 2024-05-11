class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int i=0, j=0, sum=0, ans=Integer.MAX_VALUE, ret = 0;
        Arrays.sort(nums);
        
        while(i<nums.length-2){
           int l=i+1, h=nums.length-1;
            
            while(l<h){
                sum = nums[i]+nums[l]+nums[h];
                if(Math.abs(target-sum)<ans){
                    ans = Math.abs(target-sum);
                    ret = sum;
                }
                if(sum==target){
                    return target;
                }
                else if(sum>target){
                    h--;
                }
                else{
                    l++;
                }
            }
            i++;
        }
        
        return ret;
    }
}