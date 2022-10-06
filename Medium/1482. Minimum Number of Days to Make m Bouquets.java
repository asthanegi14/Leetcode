class Solution {
    public boolean isPossible(long mid,int[] bd,int m,int k){
        int a=0, ttl=0;
        for(int j=0;j<bd.length;j++){
            if(bd[j]<=mid && ttl<k){
                ttl++;
            }
            if(ttl==k){
                ttl=0;
                a++;
            }
            if(bd[j]>mid){
                ttl=0;
            }
        }
        return (a>=m);
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(m*k)){
            return -1;
        }
        int[] clo = bloomDay.clone();
        Arrays.sort(clo);

        int j=0,n=clo.length-1,ans=0;
        
        while(j<=n){
            int mid = j+(n-j)/2;
            if(isPossible(clo[mid],bloomDay,m,k)){
                ans=clo[mid];
                n=mid-1;
            }
            else{
                j=mid+1;
            }
        }
        return ans;
    }
}
