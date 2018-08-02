package com.iris.test.leetcode.solutions;

public class BestTimeToBuyAndSellStock {

  public static void main(String[] args) {
    int[] prices = {7,1,5,3,6,4};
    System.out.println(maxProfit(prices));
  }

  public static int maxProfit(int[] prices) {
    int min = Integer.MAX_VALUE;
    int profit = 0;
    for(int price : prices) {
      min = price < min ? price : min;
      profit = (price - min) > profit ? price - min : profit;
    }
    return profit;
  }
}
