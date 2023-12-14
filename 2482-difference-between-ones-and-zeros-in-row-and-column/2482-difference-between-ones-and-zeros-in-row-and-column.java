class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n=grid.length, m=grid[0].length;
        int[] or = new int[n];
        int[] oc = new int[m];
        int[] zr = new int[n];        
        int[] zc = new int[m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    or[i]++;
                    oc[j]++;
                }
                else{
                    zr[i]++;
                    zc[j]++;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j] = or[i]+oc[j]-zr[i]-zc[j];
            }
        }
        return grid;
    }
}