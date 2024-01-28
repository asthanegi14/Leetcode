class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int n=matrix.length, m=matrix[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=i;j<m;j++){
                Map<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);
                int sum=0;
                
                for(int k=0;k<n;k++){
                    sum += matrix[k][j]-(i>0?matrix[k][i-1]:0);
                    ans += map.getOrDefault(sum-target, 0);
                    map.put(sum, map.getOrDefault(sum, 0)+1);
                }
            }
        }
        
        return ans;
    }
}