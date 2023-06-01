class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];
        int[][] trav = {{0,1}, {0,-1}, {1,1}, {1,-1}, {1,0}, {-1,0}, {-1,1}, {-1,-1}};

        if(grid[0][0]!=0 || grid[n-1][m-1]!=0){
            return -1;
        }
         
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        vis[0][0]=true;
        int count=0;

        while(!q.isEmpty()){
            count++;
            int size = q.size();

            for(int i=0;i<size;i++){
                int[] fetch = q.poll();

                if(fetch[0]==n-1 && fetch[1]==m-1){
                    return count;
                }

                for(int[] t: trav){
                    int newi = fetch[0] + t[0];
                    int newj = fetch[1] + t[1];

                    if(newi<0 || newi>=n || newj<0 || newj>=m || vis[newi][newj] || grid[newi][newj]==1){
                        continue;
                    }

                    vis[newi][newj] = true;
                    q.add(new int[]{newi, newj});
                }
            }
        }
        return -1;
    }
}
