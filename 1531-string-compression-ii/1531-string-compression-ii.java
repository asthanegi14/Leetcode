class Solution {
    public int delete(String s, int i, int k, char pre, int freq, int[][][][] dp){
        if(k<0){
            return Integer.MAX_VALUE;
        }
        if(i>=s.length()){
            return 0;
        }
        if(freq>=10){
            freq=10;
        }
        
        if(dp[i][pre-'a'][freq][k]!=-1){
            return dp[i][pre-'a'][freq][k];
        }
        int ans=Integer.MAX_VALUE;
        
        ans = Math.min(ans, delete(s, i+1, k-1, pre, freq, dp));
            
        if(s.charAt(i) != pre){
            ans = Math.min(ans, 1+delete(s, i+1, k, s.charAt(i), 1, dp));
        }
        else{
            if(freq==1 || freq==9){
                ans = Math.min(ans, 1+delete(s, i+1, k, pre, freq+1, dp));
            }
            else{
                ans = Math.min(ans, delete(s, i+1, k, pre, freq+1, dp));
            }
        }
        
        return dp[i][pre-'a'][freq][k] = ans;
    }
    public int getLengthOfOptimalCompression(String s, int k) {
        int n = s.length();
        
        if(n==k){
            return 0;
        }
        
        boolean at = true;
        
        for(int i=1;i<n;i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                at = false;
                break;
            }
        }
        
        if(at){
            n-=k;
            
            if(n==1){
                return 1;
            }
            
            return (int) Math.log10(n)+1+1;
        }
        
        int[][][][] dp = new int[n+1][27][11][101];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<27;j++){
                for(int m=0;m<11;m++){
                    for(int l=0;l<101;l++){
                        dp[i][j][m][l] = -1;
                    }
                }
            }
        }
        return delete(s, 0, k, (char)('z'+1), 0, dp);
    }
}