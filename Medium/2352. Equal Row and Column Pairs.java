class Solution {
    public int equalPairs(int[][] grid) {
        int p=0, r=0;

        for(int i=0;i<=grid.length-1;i++){
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j=0;j<grid.length;j++){
                map.put(j, grid[r][j]);
            }

            for(int k=0;k<grid.length;k++){
                int count=0;
                for(int x=0;x<grid.length;x++){
                    if(map.get(x)!=grid[x][k]){
                        count=0;
                        break;
                    }
                    else{
                        count=1;
                    }
                }
                p+=count;
            }
            r++;
        }
        return p;
    }
}
