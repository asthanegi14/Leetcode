class Solution {
    
    public int count(int i){
        int ans=0;
        while(i>0){
            if((i&1)==1){
                ans++;
            }
            i>>=1;
        }
        
        return ans;
    }
    public int[] countBits(int n) {
        int[] a = new int[n+1];
        
        for(int i=0;i<=n;i++){
            a[i] = count(i);
        }
        return a;
    }
}