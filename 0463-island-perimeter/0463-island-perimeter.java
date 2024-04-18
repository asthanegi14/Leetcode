class Solution {
    public int find(int[][] grid, int i, int j){
        if(i>=grid.length || i<0 || j>=grid[i].length || j<0){
            return 1;
        }
        if(grid[i][j]==-1){
            return 0;
        }
        
        if(grid[i][j]==0){
            return 1;
        }
        int count = 0;
        grid[i][j] = -1;
        
        count += find(grid, i+1, j);        
        count += find(grid, i, j+1);
        count += find(grid, i-1, j);
        count += find(grid, i, j-1);

        return count;
    }
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    count = find(grid, i, j);
                }
            }
        }
        return count;
    }
}