package ru.vcrop;

public class Best_Time_to_Buy_and_Sell_Stock_121_75 {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i: prices){
            min = Math.min(min, i);
            max = Math.max(max, i - min);
        }

        return max;
    }
}
