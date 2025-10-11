class Solution {
    public int maxProfit(int[] prices) {

        int lowPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
        
        if (price < lowPrice)
            lowPrice = price;

        int profit = price - lowPrice;
        
        if (profit > maxProfit)
            maxProfit = profit;
        
        }

    return maxProfit;

    }
}