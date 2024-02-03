class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[] dp = new int[n+1];
        
        for(int i=0;i<n;i++){
            int max=0, sum=0;
            
            for(int j=i;j>=Math.max(0, i-k+1);j--){
                max = Math.max(max, arr[j]);
                
                int temp = max*(i-j+1)+dp[j];
                
                sum = Math.max(sum, temp);
            }
            
            dp[i+1] = sum;
        }
        
        return dp[n];
    }
}