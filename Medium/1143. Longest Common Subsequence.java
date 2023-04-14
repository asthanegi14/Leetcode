class Solution {
    public int find(String s1, String s2, int i, int j, int[][] dp){
        int ans=0;
        if(i==s1.length() || j==s2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        char c1 = s1.charAt(i);
        char c2 = s2.charAt(j);

        if(c1==c2){
            ans = 1+find(s1, s2, i+1, j+1, dp);
        }
        else{
            ans = Math.max(find(s1, s2, i+1, j, dp), find(s1, s2, i, j+1, dp));
        }
        return dp[i][j] = ans;
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int i=0, j=0;
        int dp[][] = new int[text1.length()][text2.length()];
        for(int k=0;k<text1.length();k++){
            for(int l=0;l<text2.length();l++){
                dp[k][l]=-1;
            }
        }
        return find(text1, text2, i, j, dp);
    }
}
