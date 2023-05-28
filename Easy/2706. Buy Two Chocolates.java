class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        for(int i=1;i<prices.length;i++){
            int sum = prices[i] + prices[i-1];
            if(money-sum>=0){
                return money-sum;
            }
        }
        return money;
    }
}
