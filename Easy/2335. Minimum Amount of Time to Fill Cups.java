class Solution {
    public int fillCups(int[] amount) {
        int sum=0, max=Integer.MIN_VALUE;
        for(int i:amount){
            max = Math.max(max, i);
            sum+=i;
        }
        return Math.max(max, (sum+1)/2);
    }
}
