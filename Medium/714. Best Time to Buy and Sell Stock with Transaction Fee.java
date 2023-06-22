class Solution {
    public int maxProfit(int[] prices, int fee) {
        int max = Integer.MIN_VALUE, ans=0;

        for(int i:prices){
            max = Math.max(max, ans-i);
            ans = Math.max(ans, max+i-fee);
        }

        return ans;
    }
}
