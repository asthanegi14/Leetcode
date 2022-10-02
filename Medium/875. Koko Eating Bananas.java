class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int i=1,n=piles[piles.length-1];
        while(i<n){
            int mid=i+(n-i)/2;
            if(possible(mid,piles,h)){
                n=mid;
            }
            else{
                i=mid+1;
            }
        }
        return i;
    }
    public boolean possible(int spd, int[] p, int h){
        int t=0;
        for(int i=0;i<p.length;i++){
            int num=p[i];
            t+=num/spd;

            if(num%spd!=0){
                t++;
            }
        }
        return t<=h;
    }
}
