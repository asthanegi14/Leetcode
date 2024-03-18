class Solution {
    public int findMinArrowShots(int[][] p) {
        int ans=0, last=0;
        
        Arrays.sort(p, (a, b)->Integer.compare(a[1], b[1]));
        
        for(int i=0;i<p.length;i++){
            if(ans==0 || p[i][0]>last){
                ans++;
                last = p[i][1];
            }
        }
        
        return ans;
    }
}