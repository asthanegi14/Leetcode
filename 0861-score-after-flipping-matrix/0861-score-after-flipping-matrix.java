class Solution {
    public void toggleRow(int[][] grid, int i){
        for(int j=0;j<grid[i].length;j++){
            grid[i][j] = grid[i][j]==0?1:0;
        }
    }
    
    public void toggleCol(int[][] grid, int i){
        for(int j=0;j<grid.length;j++){
            grid[j][i] = grid[j][i]==0?1:0;
        }
    }
    
    public int bToDec(int[] a){
        int ans=0;
        
        for(int i=a.length-1,j=0; i>=0; i--,j++){
            ans += a[i] * Math.pow(2, j);
        }
        
        return ans;
    } 
    
    public int matrixScore(int[][] grid) {
        int n=grid.length, m=grid[0].length;
        
        for(int i=0;i<n;i++){
            if(grid[i][0]==0){
                toggleRow(grid, i);
            }
        }
        
        for(int i=1;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                count+=grid[j][i];
            }
            
            if(count<n-count){
                toggleCol(grid, i);
            }
        }
        
        int ans=0;
        
        for(int[] i:grid){
            ans += bToDec(i);
        }
        
        return ans;
    }
}