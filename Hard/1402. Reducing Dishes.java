class Solution {
    public int findOut(int[] s, int i, int t, int[][] arr){
        if(i>=s.length){
            return 0;
        }
        if(arr[i][t]!=0){
            return arr[i][t];
        }
        int in = (s[i]*(t+1))+ findOut(s, i+1, t+1, arr);
        int out = findOut(s, i+1, t, arr);
        arr[i][t] = Math.max(in, out);

        return arr[i][t];
    }
    public int maxSatisfaction(int[] s) {
        Arrays.sort(s);
        int[][] arr = new int[s.length+1][s.length+1];
        
        return findOut(s, 0, 0, arr);
    }
}
