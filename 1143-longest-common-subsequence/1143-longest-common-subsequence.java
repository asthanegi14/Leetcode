class Solution {
    public int find(String s1, String s2, int n, int m, int[][] dp){
        if(n<0 || m<0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(s1.charAt(n)==s2.charAt(m)){
            return 1+find(s1, s2, n-1, m-1, dp);
        }
        
        dp[n][m] = Math.max(find(s1, s2, n-1, m, dp), find(s1, s2, n, m-1, dp));
        
        return dp[n][m];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        
        for(int i=0;i<text1.length();i++){
            Arrays.fill(dp[i], -1);
        }
        return find(text1, text2, text1.length()-1, text2.length()-1, dp);
    }
}