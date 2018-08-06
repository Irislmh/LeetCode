package com.iris.test.leetcode.solutions;

public class ClimbingStairs {
  public static void main(String[] args) {
    System.out.println(climbStairs(30));
  }

  public static int climbStairs(int n) {
    int[] stairs = new int[100000];
    if(n <= 2) {
      return n;
    }
    stairs[1] = 1;
    stairs[2] = 2;
    for(int i = 3; i <= n; i++) {
      stairs[i] = stairs[i-1] + stairs[i-2];
    }
    return stairs[n];
  }
}
