class Solution {
    int mod = 1000000007;
    public long ncr(int n, int k) {
        long[][] p = new long[n + 1][k + 1];
        p[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            p[i][0] = 1;
            for (int j = 1; j <= k; j++) {
                p[i][j] = (p[i - 1][j - 1] + p[i - 1][j]) % mod;
            }
        }
        return p[n][k];
    }

    public int find(List<Integer> arr) {
        int size = arr.size();
        if (size <= 2) {
            return 1;
        }

        int root = arr.get(0);
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if (arr.get(i) > root) {
                r.add(arr.get(i));
            }
            if (arr.get(i) < root) {
                l.add(arr.get(i));
            }
        }

        long lp = find(l);
        long rp = find(r);

        return (int) ((lp % mod)%mod * (rp % mod)%mod * ncr(size - 1, l.size()) % mod);
    }

    public int numOfWays(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for (int i : nums) {
            l.add(i);
        }
        return (int) (find(l) - 1);
    }
}
