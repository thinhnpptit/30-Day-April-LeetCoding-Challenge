public class BestTimeToSellAndBuyStockII {
    // leet 5
    public int maxProfit(int[] prices){
        int profit =0;
        // check
        if (prices.length <1 || prices.length > 3*Math.pow(10,4))
            return 0;
        for (int i = 0; i < prices.length -1; i++) {
            if (prices[i] < 0 || prices[i] > Math.pow(10,4))
                return 0;
            if (prices[i+1] > prices[i])
                profit += prices[i+1] - prices[i];
        }

        return profit;
    }
}
