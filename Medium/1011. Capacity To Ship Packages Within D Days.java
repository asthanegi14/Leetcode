class Solution {
    public boolean isValid(int[] wt, int d, int m){
        int day=1;
        int sum=0;

        for(int i=0;i<wt.length;i++){
            sum+=wt[i];
            if(sum>m){
                day++;
                sum=wt[i];
            }
            if(day>d){
                return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] w, int days) {
        int low=0,hi=0,ans=-1;
        for(int i:w){
            hi+=i;
            low=Math.max(low,i);
        }
        while(low<=hi){
            int mid=low+(hi-low)/2;
            if(isValid(w,days,mid)){
                ans=mid;
                hi=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
