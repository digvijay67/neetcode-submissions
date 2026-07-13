class Solution {
    public int maxProfit(int[] prices) {
       int buyTime = Integer.MAX_VALUE;
       int profit = 0;
       for(int i = 0; i < prices.length; i++){

        if(buyTime > prices[i]){
          buyTime = prices[i];
        }

        if(prices[i] - buyTime > profit){
          profit = prices[i] - buyTime;
        }
       }
       return profit;
    }
}
