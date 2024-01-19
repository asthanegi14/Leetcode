class Solution {
    public int findMin(int[][] mat, int n, int m, int i, int j, Map<String, Integer> map) {
        if (i >= n || j >= m || i < 0 || j < 0) {
            return Integer.MAX_VALUE;
        }
        
        String k = i+" "+j;
        
        if(map.containsKey(k)){
            return map.get(k);
        }

        int sum = mat[i][j];
        int dl = findMin(mat, n, m, i + 1, j - 1, map);
        int dn = findMin(mat, n, m, i + 1, j, map);
        int dr = findMin(mat, n, m, i + 1, j + 1, map);

        int min = Math.min(dl, Math.min(dn, dr));
        int ans = sum + (i == n - 1 ? 0 : min);
        
        map.put(k, ans);
        
        return ans;
    }

    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        Map<String, Integer> map = new HashMap<>();
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            min = Math.min(min, findMin(matrix, n, m, 0, i, map));
        }
        return min;
    }
}
