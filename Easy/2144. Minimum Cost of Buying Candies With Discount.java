class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum=0, i=cost.length-1, j=2;
        if(cost.length==1){
            return cost[0];
        }
        while(i>=0){
            while(i>=0 && j-->0){
                sum+=cost[i];
                i--;
            }
            i--;
            j=2;
        }
        return sum;
    }
}
