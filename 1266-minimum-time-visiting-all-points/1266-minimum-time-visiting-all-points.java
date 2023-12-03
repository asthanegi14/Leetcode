class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for(int i=1;i<points.length;i++){
            int[] a = points[i-1];
            int[] b = points[i];
            
            int max = Math.max(Math.abs(a[0]-b[0]) , Math.abs(a[1]-b[1]));
            ans+=max;
        }
        
        return ans;
    }
}