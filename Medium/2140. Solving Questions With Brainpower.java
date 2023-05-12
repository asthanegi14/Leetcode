class Solution {
    public long find(int[][] q, int i, long[] a){
        if(i>=q.length){
            return 0;
        }
        if(a[i]!=0){
            return a[i];
        }

        long t = q[i][0] + find(q, i+1+q[i][1], a);
        long l = find(q, i+1, a);

        a[i] = Math.max(t, l);
        return a[i];
    }
    public long mostPoints(int[][] q) {
        long[] a = new long[q.length];
        return find(q, 0, a);
    }
}
