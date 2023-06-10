class Solution {
    public long validate(long mid, int idx, int n){
        long l = Math.max(mid-idx, 0);
        long ans = (mid+l) * (mid-l+1)/2;
        long r = Math.max(mid-((n-1)-idx), 0);
        ans += (mid+r)*(mid-r+1)/2;

        return ans-mid;
    }
    public int maxValue(int n, int index, int maxSum) {
        maxSum -= n;
        int i=0, j=maxSum;
        while(i<j){
            long  mid = (i+j+1)/2;
            if(validate(mid, index, n) <= maxSum){
                i = (int)mid;
            }
            else{
                j = (int)mid-1;
            }
        }
        return i+1;
    }
}
