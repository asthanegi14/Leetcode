class Solution {
    int mod = 1000000007;
    public int find(int n, int k, int tar, int[][] a){
        if(n==0 && tar==0){
            return 1;
        }
        
        if(tar<n || n*k<tar){
            return 0;
        }
        if(a[n][tar]!=0){
            return a[n][tar];
        }
        
        int count = 0;
        for(int i=1;i<=k;i++){
            if(tar<i){
                break;
            }    
            count=(count+find(n-1, k, tar-i, a)%mod)%mod;
        }
        a[n][tar] = count;
        
        return count;
    }
    public int numRollsToTarget(int n, int k, int target) {
        int[][] a = new int[n+1][target+1];
        
        return find(n, k, target, a);
    }
}