class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr.add(i);
            }
        }

        if(arr.size()<k){
            return -1;
        }
        return arr.get(k-1);
    }
}
