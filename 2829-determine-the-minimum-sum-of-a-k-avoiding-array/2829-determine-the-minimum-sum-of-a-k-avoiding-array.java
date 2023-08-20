class Solution {
    public int minimumSum(int n, int k) {
        ArrayList<Integer> a = new ArrayList<>();
        int i=1, sum=0;
        while(a.size()<n){
            int dif = k-i;
            // System.out.println("dif ="+dif);
            if(!a.contains(dif)){
                a.add(i);
                sum+=i;
            }
            i++;
        }
        return sum;
    }
}