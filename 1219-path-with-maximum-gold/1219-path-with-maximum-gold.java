class Solution {
    public int find(int[][] a, int i, int j, int[][] dir){
        if(i<0 || i>=a.length || j<0 || j>=a[0].length || a[i][j]==0){
            return 0;
        }
        
        int temp = a[i][j];
        a[i][j] = 0;
        
        int max=temp;
        
        for(int[] k:dir){
            int ni = i+k[0], nj = j+k[1];
            max = Math.max(max, temp + find(a, ni, nj, dir));
        }
        
        a[i][j] = temp;
        return max;
    }
    
    public int getMaximumGold(int[][] grid) {
        int n=grid.length, m=grid[0].length, ans=0;
        int[][] dir = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0){
                    ans = Math.max(ans, find(grid, i, j, dir));
                }
            }
        }
        
        return ans;
    }
}