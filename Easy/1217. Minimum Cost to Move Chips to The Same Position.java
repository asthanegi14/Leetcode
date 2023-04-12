class Solution {
    public int minCostToMoveChips(int[] position) {
        int ev=0, od=0;
        for(int i:position){
            if(i%2==0){
                ev++;
            }
            else{
                od++;
            }
        }

        return Math.min(ev,od);
    }
}
