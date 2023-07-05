class Solution {
    public int longestSubarray(int[] nums) {
        int i=0, j=0, k=0;
        int ans=0;
        int max=0;

        while(i<nums.length){
            if(nums[i]==0){
                k++;
            }
            while(k>1){
                if(nums[j]==0){
                    k--;
                }
                j++;
            }
            ans=Math.max(ans, i-j+1-k);
            i++;
        }
        return (ans==nums.length) ? ans-1:ans;
    }
}
