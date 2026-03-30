class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int sellPrice = 0;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= buyPrice) {
                buyPrice = prices[i];
            } else if(i == prices.length -1) {
                if (prices[i] > buyPrice) {
                    profit = profit + prices[i] - buyPrice;
                }
                return profit;
            }
            else if (prices[i+1] < prices[i]) {
                profit = profit + prices[i] - buyPrice;
                buyPrice = prices[i+1];
            } else if (prices[i] > sellPrice) {
                sellPrice = prices[i];
            }
        }
        return profit;
    }
}