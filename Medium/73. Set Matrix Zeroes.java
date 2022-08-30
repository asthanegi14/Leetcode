class Solution {
    public void setZeroes(int[][] matrix) {
        int[] r = new int[matrix.length];
        int[] c = new int[matrix[0].length];
        
        Arrays.fill(r,-1);
        Arrays.fill(c,-1);
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    r[i]=0;
                    c[j]=0;
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(r[i]==0 || c[j]==0){
                    matrix[i][j]=0;
                }        
            }
        }
    }
}
