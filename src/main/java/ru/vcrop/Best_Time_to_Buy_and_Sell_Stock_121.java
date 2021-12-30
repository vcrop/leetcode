package ru.vcrop;

/*https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
        Runtime: 2 ms, faster than 65.07% of Java online submissions for Best Time to Buy and Sell Stock.
        Memory Usage: 105.1 MB, less than 16.98% of Java online submissions for Best Time to Buy and Sell Stock.*/
public class Best_Time_to_Buy_and_Sell_Stock_121 {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i: prices) {
            min = Math.min(min, i);
            maxProfit = Math.max(maxProfit, i - min);
        }
        return maxProfit;
    }

}
