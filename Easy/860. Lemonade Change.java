class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] coins = new int[2];

        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                coins[0]++;
            }
            else if(bills[i]==10){
                coins[0]--;
                coins[1]++;
            }
            else if(coins[0]>0 && coins[1]>0){
                coins[0]--;
                coins[1]--;
            }
            else {
                coins[0]-=3;
            }
            if(coins[0]<0){
                return false;
            }
        }
        return true;
    }
}
