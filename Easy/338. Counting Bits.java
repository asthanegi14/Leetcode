class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        int idx=1;

        for(int i=idx;i<=n;i++){
            if(idx*2 == i){
                idx *= 2;
            }
            arr[i] = arr[i-idx]+1;
        }
        return arr;
    }
}
