class Solution {
    public static int find(String s){
        int mod = 1000000007;
        int n = s.length();
        
        int[] fre = new int[256];
        Arrays.fill(fre, -1);
        
        int[] dp = new int[n+1];
        dp[0] = 1;
        
        for(int i=1;i<=n;i++){
            dp[i] = (2*dp[i-1])%mod;
            
            if(fre[s.charAt(i-1)] !=-1){
                dp[i] = (dp[i] - dp[fre[s.charAt(i-1)]-1]+mod)%mod;
            }
            
            fre[s.charAt(i-1)]=i;
        }
        return dp[n];
    }
    public static String betterString(String str1, String str2) {
        // Code here
        int a = find(str1);
        int b = find(str2);
        
        return a>=b?str1:str2;
    }
}
