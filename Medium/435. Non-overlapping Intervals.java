class Solution {
    public int eraseOverlapIntervals(int[][] in) {
        Arrays.sort(in, new Comparator<int[]>(){
            public int compare(int[] x, int[] y){
                return x[1]-y[1];
            }
        });
        int ans=0, l=Integer.MIN_VALUE;
        for(int[] i: in){
            if(i[0]>=l){
                l = i[1];
            }
            else{
                ans++;
            }
        }
        return ans;
    }
}
