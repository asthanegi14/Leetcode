class Solution {
    public void dfs(int i, int k, int[] c, int[] cookies, int[] res){
        if(i==cookies.length){
            int max = 0;
            for(int j : c){
                max = Math.max(max, j);
            }
            res[0] = Math.min(res[0], max);
            return;
        }

        for(int m=0;m<k;m++){
            c[m] += cookies[i];
            dfs(i+1, k, c, cookies, res);
            c[m] -= cookies[i];
        }
    }
    public int distributeCookies(int[] cookies, int k) {
        int[] res = new int[1];
        res[0] = Integer.MAX_VALUE;
        dfs(0, k, new int[k], cookies, res);
        return res[0];
    }
}
