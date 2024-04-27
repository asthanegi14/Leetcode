class Solution {
    public int dfs(String ring, String key, int i, int j, Integer[][] dp){
        if(j==key.length()){
            return 0;
        }
        
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        
        boolean c = false, ac = false;
        int cCount = Integer.MAX_VALUE, acCount = Integer.MAX_VALUE;
        
        for(int k=0;k<ring.length();k++){
            int temp = (k+i)%ring.length();
            
            if(!c && ring.charAt(temp) == key.charAt(j)){
                cCount = k+dfs(ring, key, temp, j+1, dp);
                c=true;
            }
            
            int temp2 = i-k;
            if(temp2<0){
                temp2 = ring.length()+i-k;
            }
            
            if(!ac && ring.charAt(temp2) == key.charAt(j)){
                acCount = k+dfs(ring, key, temp2, j+1, dp);
                ac=true;
            }
            
            if(c && ac){
                break;
            }
        }
        
        return dp[i][j] = Math.min(cCount, acCount)+1;
    }
    public int findRotateSteps(String ring, String key) {
        Integer[][] dp = new Integer[ring.length()][key.length()];
        
        return dfs(ring, key, 0, 0, dp);
    }
}