class Solution {
    public int timeRequiredToBuy(int[] t, int k) {
        int ans=0;
        
            for(int i=0;i<t.length;i++){
                if(i<=k){
                    ans += Math.min(t[i], t[k]);
                }
                else{
                    ans += Math.min(t[i], t[k]-1);
                }
            }
        
        return ans;
    }
}