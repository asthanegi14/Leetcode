class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n=rowSum.length, m=colSum.length;
        int i=0, j=0;
        
        int[][] ans = new int[n][m];
        
        while(i<n && j<m){
            ans[i][j] = Math.min(rowSum[i], colSum[j]);
            rowSum[i] -= ans[i][j];            
            colSum[j] -= ans[i][j];
            
            if(colSum[j]==0){
                j++;
            }
            if(rowSum[i]==0){
                i++;
            }
        }
        
        return ans;
    }
}