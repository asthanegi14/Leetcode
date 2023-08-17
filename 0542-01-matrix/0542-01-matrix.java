class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        int n = mat.length, m=mat[0].length;
        
        if(mat==null || n==0 || m==0){
            return new int[0][0];
        }
        int max=n*m;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i, j});
                }
                else{
                    mat[i][j] = max;
                }
            }
        }

        int[][] dir = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};

        while(!q.isEmpty()){
            int[] poll = q.poll();
            for(int[] i: dir){
                int r = poll[0] + i[0], c = poll[1] + i[1];
                if(r>=0 && r<n && c>=0 && c<m && mat[r][c]>mat[poll[0]][poll[1]]+1){
                    q.add(new int[]{r, c});
                    mat[r][c] = mat[poll[0]][poll[1]]+1;
                }
            }
        }
        return mat;
    }
}