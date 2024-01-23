public class BestTimetoBuyandSellStockII {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 4, 5};
        System.out.println(String.valueOf(maxProfit(prices)));
    }
    public static int maxProfit(int[] prices) {
        int result = 0;
        for (int idx = 0; idx < prices.length-1; idx++){
            if (prices[idx] < prices[idx+1]) {
                result += prices[idx+1] - prices[idx];
            }
        }
        return result;
    }
}
