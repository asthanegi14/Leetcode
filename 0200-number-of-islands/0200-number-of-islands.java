class Solution {
    public void find(char[][] grid, int i, int j, boolean[][] vis){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length){
            return;
        }
        if(vis[i][j] || grid[i][j]=='0'){
            return;
        }
        
        vis[i][j] = true;
        grid[i][j] = '0';
        find(grid, i+1, j, vis);
        find(grid, i-1, j, vis);
        find(grid, i, j+1, vis);
        find(grid, i, j-1, vis);

    }
    public int numIslands(char[][] grid) {
        int count=0;
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(!vis[i][j] && grid[i][j] == '1'){
                    count++;
                    find(grid, i, j, vis);
                }
            }
        }
        
        return count;
    }
}