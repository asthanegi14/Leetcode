class Solution {
    public int getMaximumGenerated(int n) {
        int[] ans = new int[n+1];
        if(n==0){
            return 0;
        }
        ans[0] = 0;
        ans[1] = 1;

        for(int i=1;(2*i)<=n;i++){
            ans[2*i] = ans[i];
            if(2*i+1<=n){
                ans[2*i+1] = ans[i] + ans[i+1];
            }
        }
        int max=0;
        for(int i=0;i<=n;i++){
            max = Math.max(max, ans[i]);
        }
        return max;
    }
}
