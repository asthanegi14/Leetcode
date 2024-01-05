class Solution {
    public int lengthOfLIS(int[] nums) {
        int ans=1;
        int n=nums.length;
        int[] a = new int[n];
        a[0]=1;
        
        for(int i=1;i<n;i++){
            int m = 0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i] && a[j]>m){
                    m=a[j];
                }
            }
            a[i] = m+1;
            if(a[i]>ans){
                ans = a[i];
            }
        }
        return ans;
    }
}