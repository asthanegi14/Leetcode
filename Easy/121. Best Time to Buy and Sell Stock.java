// class Solution {
//     public int maxProfit(int[] prices) {
//         int small=prices[0],j=0,pro=0;
//         for(int i=0;i<prices.length;i++)
//         {
//             if(prices[i]<small)
//             {
//                 small = prices[i];
//             }
//             j = prices[i]-small;
//             if(j>pro)
//             {
//                 pro=j;
//             }
//         }
//         return pro;
//     }
// }

class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            max=Math.max(max,prices[i]-min);
        }
        return max;
    }
}
