class Solution {
    public int maximumUnits(int[][] bt, int s) {
        int ans=0;
        Arrays.sort(bt, (x,y)->y[1]-x[1]);

        for(int i=0;i<bt.length;i++){
            if(bt[i][0]<=s){
                ans+=bt[i][1]*bt[i][0];
                s-=bt[i][0];
            }
            else{
                ans+=bt[i][1]*s;
                s=0;
            }
        }
        return ans;
    }
}
