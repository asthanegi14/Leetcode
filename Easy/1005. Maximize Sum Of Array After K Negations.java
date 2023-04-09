class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE, ans=0;
        int i=0;
       
        for(i=0;i<nums.length;i++){
            // min = Math.min(min, nums[i]);
            if(k!=0){
                if(nums[i]<0){
                    nums[i]*=-1;
                    k--;
                }
                else if(nums[i]>0){
                    if(k%2!=0){
                        min = Arrays.stream(nums).min().getAsInt();
                        // if(ans!=0){
                            ans+=2*(min*-1);
                        // }
                        k--;
                    }
                }
            }
            ans+=nums[i];
        }
        Arrays.sort(nums);
        if(k!=0 && k%2!=0){
            ans-=nums[nums.length-1];
        }
        return ans;
    }
}
