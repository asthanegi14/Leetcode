class Solution {
    public int[] singleNumber(int[] nums) {
        int x=0;
        int[] ans = new int[2];
        
        for(int i:nums){
            x^=i;
        }
        
        x &= -x;
        
        for(int i:nums){
            if((i&x)==0){
                ans[0] ^= i;
            }
            else{
                ans[1] ^= i;
            }
        }
        
        return ans;
    }
}