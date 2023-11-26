class Solution {
    public int largestSubmatrix(int[][] mat) {
        int n = mat.length, m = mat[0].length, ans=0;
        int[][] a = new int[n][m];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[j][i]==1){
                    a[j][i] = j!=0?a[j-1][i]+1:1;
                }
            }
        }
        
        for(int[] i:a){
            Arrays.sort(i);
        }
        
        for(int i=0;i<n;i++){
            for(int j=m-1;j>=0;j--){
                int max = a[i][j];
                ans = Math.max(ans, (m-j)*max);
            }
        }
        
        return ans;
    }
}