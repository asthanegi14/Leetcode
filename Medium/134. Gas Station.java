class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0, totalcost=0;
        int currgas=0, start=0,i=0;

        while(i<gas.length){
            totalgas += gas[i];
            totalcost += cost[i];
            currgas += gas[i]-cost[i];
            if(currgas<0){
                start=i+1;
                currgas=0;
            }
            i++;
        }
        if(totalgas<totalcost){
            return -1;
        }
        return start;
    }
}
