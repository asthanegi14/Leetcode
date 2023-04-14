class Solution {
    public int find(String s, String s2, int i, int j, int[][] dp){
        if(i==s.length() || j==s2.length()){
            return 0;
        }
        int ans=0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        char c1 = s.charAt(i);
        char c2 = s2.charAt(j);

        if(c1==c2){
            ans = 1+find(s, s2, i+1, j+1, dp);
        }
        else{
            ans = Math.max(find(s, s2, i+1, j, dp), find(s, s2, i, j+1, dp));
        }
        return dp[i][j] = ans;
    }
    public int longestPalindromeSubseq(String s) {
        int i=0, j=0;
        String s2 = "";
        for(int k=s.length()-1;k>=0;k--){
            s2+=s.charAt(k);
        }
        int[][] dp = new int[s.length()][s2.length()];
        for(int k=0;k<s.length();k++){
            for(int l=0;l<s2.length();l++){
                dp[k][l]=-1;
            }
        }
        return find(s, s2, i, j, dp);
    }
}
