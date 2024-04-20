class Solution {
    public int[] findRange(Set<String> vis, int[][] land, int i, int j) {
        Stack<int[]> st = new Stack<>();
        st.push(new int[]{i, j});
        vis.add(i + "and" + j);

        int minR = i, minC = j, maxR = i, maxC = j;

        while (!st.isEmpty()) {
            int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            int[] pop = st.pop();

            int temp1 = pop[0], temp2 = pop[1];

            for (int[] k : dir) {
                int newI = temp1 + k[0], newJ = temp2 + k[1];

                if (newI < 0 || newI >= land.length || newJ < 0 || newJ >= land[0].length || vis.contains(newI + "and" + newJ) || land[newI][newJ] == 0) {
                    continue;
                } else {
                    vis.add(newI + "and" + newJ);
                    st.push(new int[]{newI, newJ});
                    minR = Math.min(minR, newI);
                    minC = Math.min(minC, newJ);
                    maxR = Math.max(maxR, newI);
                    maxC = Math.max(maxC, newJ);
                }

            }
        }

        return new int[]{minR, minC, maxR, maxC};
    }

    public int[][] findFarmland(int[][] land) {
        List<int[]> ans = new ArrayList<>();
        Set<String> vis = new HashSet<>();

        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                if (!vis.contains(i + "and" + j) && land[i][j] == 1) {
                    int[] range = findRange(vis, land, i, j);
                    ans.add(range);
                }
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
