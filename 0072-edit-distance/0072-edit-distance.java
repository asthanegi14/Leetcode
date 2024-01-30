class Solution {
    public int find(String a, String b, int i, int j, int[][] dp){
        if(i>=a.length() || j>=b.length()){
            return Math.max(a.length()-i, b.length()-j);
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans=0;
        if(a.charAt(i)==b.charAt(j)){
            ans+=find(a, b, i+1, j+1, dp);
        }
        else{
            int in = 1+ find(a, b, i, j+1, dp);
            int dl = 1+ find(a, b, i+1, j, dp);
            int rp = 1+ find(a, b, i+1, j+1, dp);
            
            ans += Math.min(in, Math.min(dl, rp));
        }
            dp[i][j] = ans;
        return dp[i][j];
    }
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()][word2.length()];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i], -1);
        }
        return find(word1, word2, 0, 0, dp);
    }
}