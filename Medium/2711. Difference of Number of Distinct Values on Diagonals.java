import java.util.HashMap;

class Solution {
    public int countDist(int i, int j, int[][] g, int[][] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        while (i > 0 && j > 0) {
            if (!map.containsKey(g[i - 1][j - 1])) {
                map.put(g[i - 1][j - 1], 0);
            }
            i--;
            j--;
        }
        return map.size();
    }

    public int countDisBtm(int i, int j, int[][] g, int[][] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        while (i < g.length - 1 && j < g[0].length - 1) {
            if (!map.containsKey(g[i + 1][j + 1])) {
                map.put(g[i + 1][j + 1], 0);
            }
            i++;
            j++;
        }
        return map.size();
    }

    public int[][] differenceOfDistinctValues(int[][] grid) {
        int m = grid[0].length;
        int n = grid.length;
        int[][] ans = new int[n][m];
        int[][] top = new int[n][m];
        int[][] btm = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0) {
                    top[i][j] = 0;
                }
                if (i == n - 1 || j == m - 1) {
                    btm[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                top[i][j] = countDist(i, j, grid, top);
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                btm[i][j] = countDisBtm(i, j, grid, btm);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = Math.abs(top[i][j] - btm[i][j]);
            }
        }
        return ans;
    }
}
