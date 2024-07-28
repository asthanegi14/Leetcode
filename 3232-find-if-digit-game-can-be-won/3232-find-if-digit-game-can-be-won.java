class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0, sum2=0;
        
        for(int i:nums){
            if(i<10){
                sum1+=i;
            }
            else{
                sum2+=i;
            }
        }
        
        if(sum1>sum2 || sum2>sum1){
            return true;
        }
        return false;
    }
}