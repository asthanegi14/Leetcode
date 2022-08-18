class Solution {
    public int maxProfit(int[] prices) {
        int small=prices[0],j=0,pro=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<small)
            {
                small = prices[i];
            }
            j = prices[i]-small;
            if(j>pro)
            {
                pro=j;
            }
        }
        return pro;
    }
}
