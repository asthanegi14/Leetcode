class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String x,String y,int m,int n)
    {
        //Your code here
        int[][] dp = new int[m+1][n+1];
        int max=-1;
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
                
                max = Math.max(max, dp[i][j]);
            }
        }
        
        return n+m-max;
    }
}
