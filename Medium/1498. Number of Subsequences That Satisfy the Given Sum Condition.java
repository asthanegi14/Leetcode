class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod =  (int)Math.pow(10,9)+7;
        int i=0, j=nums.length-1, ans=0;
        int[] ma = new int[nums.length];
        ma[0] = 1;
        for(int k=1;k<nums.length;k++){
            ma[k] = (ma[k-1]*2)%((int)Math.pow(10,9)+7);
        }
        while(i<=j){
            if(nums[i]+nums[j]<=target){
                ans = (ans+ ma[j-i])%((int)Math.pow(10,9)+7);
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}
