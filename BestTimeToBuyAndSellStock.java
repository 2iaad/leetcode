class BestTimeToBuyAndSellStock {

    static public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        
        for (int i = 0; i < prices.length; i++)
        {
            if (prices[i] < min)
                min = prices[i];
            else if (prices[i] - min > profit)
                profit = prices[i] - min;
        }
        return profit;
    }
    static public void main(String[] args) {

        int[] prices = {2,4,1, 6, 0};
        System.out.println(maxProfit(prices));
    }
}