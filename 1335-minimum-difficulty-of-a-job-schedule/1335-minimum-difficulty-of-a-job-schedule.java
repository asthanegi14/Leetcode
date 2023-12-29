class Solution {
    public int cal(int d, int i, int[] job, int[][] dp){
        int n = job.length;
        if(d==0 && i==n){
            return 0;
        }
        if(d==0 || i==n){
            return Integer.MAX_VALUE;
        }
        if(dp[i][d]!=-1){
            return dp[i][d];
        }
        
        int max = job[i];
        int min = Integer.MAX_VALUE;
        
        for(int j=i;j<n;j++){
            max = Math.max(max, job[j]);
            int curr = cal(d-1, j+1, job, dp);
            
            if(curr!=Integer.MAX_VALUE){
                min = Math.min(min, curr+max);
            }
        }
        
        return dp[i][d] = min;
    }
    public int minDifficulty(int[] job, int d) {
        int n = job.length;
        if(n<d){
            return -1;
        }
        int[][] dp = new int[n][d+1];
        
        for(int[] i:dp){
            Arrays.fill(i, -1);
        }
        
        // return cal(d, 0, job);
        return cal(d, 0, job, dp);
    }
}