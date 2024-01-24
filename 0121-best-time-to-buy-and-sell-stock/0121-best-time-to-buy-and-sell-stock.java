class Solution {
    public int maxProfit(int[] p) {
        int ans=0, min=p[0];
        
        for(int i=1;i<p.length;i++){
            ans = Math.max(p[i]-min, ans);
            min = Math.min(min, p[i]);
            // System.out.println("ans="+ans+" min="+min);
        }
        
        return ans;
    }
}