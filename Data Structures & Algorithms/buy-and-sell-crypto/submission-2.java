class Solution {
    public int maxProfit(int[] prices) {
        return maxProfitHelper(prices, 0, 1, 0, 0, 0);
    }
    public int maxProfitHelper(int[] prices, int indexBuy, int indexSell, int profit, int profitBuy, int profitSell) {
        if (indexSell >= prices.length) {
            return profit;
        }
        if (prices.length == 0) {
            return profit;
        }
        if (prices[indexSell] - prices[indexBuy] > profit) {
            return maxProfitHelper(prices, indexBuy, indexSell+1, prices[indexSell] - prices[indexBuy], indexBuy, indexSell);
        }
        if (prices[indexSell] < prices[indexBuy]) {
            return maxProfitHelper(prices, indexSell, indexSell+1, profit, profitBuy, profitSell);
        }
        if (prices[indexSell] - prices[indexBuy] <= profit) {
            return maxProfitHelper(prices, indexBuy, indexSell+1, profit, profitBuy, profitSell);
        }
        return profit;
    } 
}
