package com.app.neetcode.twopointer;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {2,1,2,1,0,1,2};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Track the minimum price seen so far
        int maxProfit = 0; // Track the maximum profit

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update the minimum price
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Update max profit
            }
        }

        return maxProfit;
    }

}
