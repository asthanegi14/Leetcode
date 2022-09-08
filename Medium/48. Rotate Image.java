class Solution {
    public void rotate(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        
        //transpose the matrix
        
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp = a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        
        //then reverse it
        for(int i=0;i<n;i++){
            for(int j=0;j<m/2;j++){
                int temp = a[i][j];
                a[i][j]=a[i][n-j-1];
                a[i][n-j-1]=temp;
            }
        }
    }
}
