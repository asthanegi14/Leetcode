class Solution {
    public int countVowelPermutation(int n) {
        int m = 1000000007;
        int[][] dp = new int[n+1][5];
        if(n==1){return 5;}
        if(n==2){return 10;}
        
        dp[1][0]=dp[1][1]=dp[1][2]=dp[1][3]=dp[1][4]=1;
        for(int i=2;i<=n;i++){
            dp[i][0] = ((dp[i-1][1]+dp[i-1][2])%m + dp[i-1][4]) % m;
            System.out.print(dp[i][0]+" ");
            dp[i][1] = (dp[i-1][0]+dp[i-1][2])%m;
            System.out.print(dp[i][1]+" ");
            dp[i][2] = (dp[i-1][1]+dp[i-1][3])%m;
            System.out.print(dp[i][2]+" ");
            dp[i][3] = dp[i-1][2]%m;
            System.out.print(dp[i][3]+" ");
            dp[i][4] = (dp[i-1][2]+dp[i-1][3])%m;
            System.out.print(dp[i][4]+" ");
            System.out.println();
        }
        return (((dp[n][0]+dp[n][1])%m+(dp[n][2]+dp[n][3])%m)%m+dp[n][4])%m;
    }
}
