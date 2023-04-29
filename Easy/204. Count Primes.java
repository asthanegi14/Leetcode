class Solution {
    public int countPrimes(int n) {
        boolean[] vis = new boolean[n];
        int count=0;
        for(int i=2;i<n;i++){
            if(!vis[i]){
                for(long j=(long)i*i; j<n;j+=i){
                    vis[(int)j]=true;
                }
                count++;
            }
        }
        return count;
    }
}
