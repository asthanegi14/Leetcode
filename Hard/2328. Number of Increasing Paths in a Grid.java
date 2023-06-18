class Solution {
    int mod = (int)Math.pow(10, 9)+7;
    public int find(int i, int j, int pre, int[][] grid, int[][] d){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]<=pre){
            return 0;
        }
        if(d[i][j]!=-1){
            return d[i][j];
        }

        int l = find(i, j-1, grid[i][j], grid, d);
        int r = find(i, j+1, grid[i][j], grid, d);
        int t = find(i-1, j, grid[i][j], grid, d);
        int dwn = find(i+1, j, grid[i][j], grid, d);

        return d[i][j] = (1+l+r+t+dwn)%mod;
    }
    public int countPaths(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans=0;

        int[][] d = new int[n][m];
        for(int[] a: d){
            Arrays.fill(a, -1);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans = (ans+find(i, j, -1, grid, d))%mod;
            }
        }
        return ans;
    }
}
