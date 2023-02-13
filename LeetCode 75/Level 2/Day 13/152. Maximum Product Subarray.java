class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], ans = nums[0];
        for(int i=1;i<nums.length;i++){
            int n = nums[i];

            if(n<0){
                int temp = max;
                max = min;
                min = temp;
                // System.out.println("n<0 = "+min+" "+max);

                max = Math.max(n,n*max);
                min = Math.min(n,n*min);
            }
            else{
                max = Math.max(n,n*max);
                min = Math.min(n,n*min);
            }
                // System.out.println(min+" "+max);
            ans = Math.max(max,ans);
        }
        return ans;
    }
}
