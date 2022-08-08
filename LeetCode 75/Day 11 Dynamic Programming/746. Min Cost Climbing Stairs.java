class Solution {
    public int minCostClimbingStairs(int[] cost) {
        for(int i=2;i<cost.length;i++){
            if(cost[i-1]<cost[i-2]){
                cost[i]=cost[i]+cost[i-1];
            }
            else{
                cost[i]=cost[i]+cost[i-2];
            }
        }
        if(cost[cost.length-1]>cost[cost.length-2]){
            return cost[cost.length-2];
        }   
        else
            return cost[cost.length-1];
    }
}
