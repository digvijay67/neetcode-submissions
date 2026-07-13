class Solution {
    // public int maxProfit(int[] prices) {
    //    int buyTime = Integer.MAX_VALUE;
    //    int profit = 0;
    //    for(int i = 0; i < prices.length; i++){

    //     if(buyTime > prices[i]){
    //       buyTime = prices[i];
    //     }

    //     if(prices[i] - buyTime > profit){
    //       profit = prices[i] - buyTime;
    //     }
    //    }
    //    return profit;
    // }
    public int maxProfit(int[] prices){
      int buytime = Integer.MAX_VALUE;
      int profit = 0;
      for(int i = 0 ; i < prices.length; i++){
        buytime = Math.min(prices[i] , buytime);
        profit = Math.max(prices[i] - buytime , profit);
      }
      return profit;
    }
}
