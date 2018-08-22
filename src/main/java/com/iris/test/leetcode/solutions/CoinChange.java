package com.iris.test.leetcode.solutions;

/*
You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

Example 1:

Input: coins = [1, 2, 5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1
Example 2:

Input: coins = [2], amount = 3
Output: -1
Note:
You may assume that you have an infinite number of each kind of coin.
*/

public class CoinChange {

  public static void main(String[] args) {
    int[] coins = {186, 419, 83, 408};
    int amount = 6249;
    System.out.println(coinChange(coins, amount));
  }


  public static int coinChange(int[] coins, int amount) {
    if (amount == 0) return 0;
    if (coins == null || coins.length == 0 || amount < 0) return -1;

    int[] dp = new int[amount + 1];
    for (int i = 1; i <= amount; i++) {
      dp[i] = Integer.MAX_VALUE;
      for (int j = 0; j < coins.length; j++) {
        if (i >= coins[j] && dp[i - coins[j]] != Integer.MAX_VALUE) {
          dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
        }
      }
    }
    return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
  }
}
