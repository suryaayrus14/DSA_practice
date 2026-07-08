class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int cheapestPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
    int profit = prices[i] - cheapestPrice;
    maxProfit = Math.max(maxProfit, profit);
    
    cheapestPrice = Math.min(cheapestPrice, prices[i]);
}

        return maxProfit;
    }
}