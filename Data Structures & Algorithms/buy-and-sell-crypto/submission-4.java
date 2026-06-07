class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            if (price - buyPrice > maxProfit) {
                maxProfit = price - buyPrice;
            }
            if (price < buyPrice) {
                buyPrice = price;
            }
        }
        return maxProfit;
    }
}
