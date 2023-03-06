class Solution {
    public int maxProfit(int[] prices) {
        int ans=0, min=0, curr=prices[0];

        for(int i=0;i<prices.length;i++){
            if(curr>prices[i]){
                curr = prices[i];
            }
            min = prices[i] - curr;

            if(ans<min){
                ans = min;
            }
        }
        return ans;
    }
}
