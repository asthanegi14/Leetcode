class Solution {
    public int largestAltitude(int[] gain) {
        int ans=Integer.MIN_VALUE;
        int[] up = new int[gain.length+1];
        up[0] = 0;
        for(int i=0;i<gain.length;i++){
            up[i+1] = gain[i]+up[i];
        }
        for(int i=0;i<up.length;i++){
            ans = Math.max(ans, up[i]);
        }
        return ans;
    }
}
