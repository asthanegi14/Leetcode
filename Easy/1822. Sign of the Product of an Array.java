class Solution {
    public int arraySign(int[] nums) {
        int neg=0;
        for(int i:nums){
            if(i<0){
                neg++;
            }
            if(i==0){
                return 0;
            }
        }
        if(neg%2==0){
            return 1;
        }
        return -1;
    }
}
