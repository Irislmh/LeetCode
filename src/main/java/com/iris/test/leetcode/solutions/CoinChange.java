package com.iris.test.leetcode.solutions;

public class CoinChange {

  public static void main(String[] args) {
    int[] coins = {186, 419, 83, 408};
    int amount = 6249;
    System.out.println(coinChange(coins, amount));
  }


  public static int coinChange(int[] coins, int amount) {
    if(amount == 0) return 0;
    int[] count = new int[amount + 1];
    for(int i = 1; i < count.length; i++){
      count[i] = -1;
    }
    for(int c : coins){
      if(c <= amount)  count[c] = 1;
    }
    for(int v = 1; v <= amount; v++){
      int currentMinCount = Integer.MAX_VALUE;
      for(int c : coins){
        if(v - c >= 0){
          if(c <= amount && count[v-c] != -1){
            if(count[v-c] + 1 < currentMinCount){
              currentMinCount = count[v-c] + 1;
            }
          }
        }
      }
      if(currentMinCount != Integer.MAX_VALUE){
        if(count[v] == -1){
          count[v] = currentMinCount;
        }
        else if(currentMinCount < count[v]){
          count[v] = currentMinCount;
        }
      }
    }
    return count[amount];
  }
}
