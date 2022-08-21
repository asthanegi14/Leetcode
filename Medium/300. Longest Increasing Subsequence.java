class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0]=1;
        int r=1;
        for(int i=1;i<nums.length;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    if(ans[j]>max){
                        max=ans[j];
                    }
                }
            }
            ans[i]=max+1;
            if(ans[i]>r){ r = ans[i];}
        }
        return r;
    }
}
