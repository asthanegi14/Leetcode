class Solution {
    public int dfs(int temp, int[][] dp, Integer[] a){
        if(temp==dp.length){
            return 0;
        }
        if(a[temp]!=null){
            return a[temp];
        }
        
        int nxt = find(temp, dp);
        int take = dp[temp][2] + dfs(nxt, dp, a);
        int skip = dfs(temp+1, dp, a);
        
        return a[temp] = Math.max(take, skip);
    }
    
    public int find(int a, int[][] dp){
        int i = a+1, j = dp.length-1;
        
        while(i<=j){
            int mid = i+(j-i)/2;
            if(dp[mid][0] >= dp[a][1]){
                if(dp[mid-1][0]>= dp[a][1]){
                    j = mid-1;
                }
                else{
                    return mid;
                }
            }
            else{
                i = mid+1;
            }
        }
        
        return dp.length;
    }
    public int jobScheduling(int[] st, int[] et, int[] p) {
        int n=st.length, m=et.length, o=p.length;
        int[][] dp = new int[n][3];
        
        for(int i=0;i<n;i++){
            dp[i] = new int[]{st[i], et[i], p[i]};
        }
        
        Arrays.sort(dp, (a,b) -> a[0]-b[0]);
        
        return dfs(0, dp, new Integer[n]);
    }
}