class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        
        int i=piles.length-2, j=0, sum=0;
        
        while(j<i){
            sum+=piles[i];
            i-=2;
            j++;
        }
        return sum;
    }
}