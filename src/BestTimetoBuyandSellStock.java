public class BestTimetoBuyandSellStock {

    public static void main(String[] args) {
        int[] nums = {3,3,5,0,0,3,1,4};
        System.out.println(String.valueOf(maxProfit(nums)));
    }
    public static int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxDiff = 0;
        for (int idx = 0;idx < prices.length; idx++){
            if (prices[idx] < minValue) {
                minValue = prices[idx];
            }
            int diff = prices[idx] -minValue;
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        return maxDiff;
    }
}
