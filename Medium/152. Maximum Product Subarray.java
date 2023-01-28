class Solution {
    public int maxProduct(int[] nums) {

        int productE=nums[0], productO=nums[0], ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int n = nums[i];

            if(n<0){
                int t1=productE;
                int t2=productO;
                productO=Math.max(n*t1,n);
                productE=Math.min(n*t2,n);
            }
            else{
                productO=Math.max(n*productO,n);
                productE=Math.min(n*productE,n);
            }
            ans=Math.max(productO,ans);

        }
        return ans;
    }
}
