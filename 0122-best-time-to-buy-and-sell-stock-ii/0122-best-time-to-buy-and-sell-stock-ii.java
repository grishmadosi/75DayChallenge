class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0, bestBuy = prices[0];
        int fs = 0;
        for(int i = 1; i < prices.length; i++){
              if(prices[i] < prices[i-1]){
                fs += maxPro;
                maxPro = 0;
                bestBuy = prices[i];
              }else{
                maxPro = Math.max(maxPro, prices[i] - bestBuy);
              }
        }
        return fs+maxPro;
    }
}