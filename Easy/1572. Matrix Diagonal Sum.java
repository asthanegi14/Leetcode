class Solution {
    public int diagonalSum(int[][] mat) {
        int i=0, j=0, sum=0;

        while(i<mat.length && j<mat[0].length){
            if(i==j){
                sum+=mat[i][j];
                mat[i][j]=0; 
            }
            i++;j++;
        }

        i=0; j=mat.length-1;
        while(i<mat.length && j>=0){
            sum+=mat[i][j];
            i++;j--;
        }
        return sum;
    }
}
