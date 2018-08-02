package com.iris.test.leetcode.solutions;

public class MaximumProductSubarray {
  public static void main(String[] args) {
    int[] array = {0, -2, -4, -6};
    System.out.println(getMaxProduct(array));
  }

  public static int getMaxProduct(int[] A) {
    int max = A[0];
    int length = A.length;
    int[] dp_min = new int[length];
    int[] dp_max = new int[length];
    dp_min[0] = dp_max[0] = A[0];
    for (int i = 1; i < length; ++i) {
      dp_min[i] = Math.min(
          Math.min(dp_max[i - 1] * A[i], dp_min[i - 1] * A[i]), A[i]);
      dp_max[i] = Math.max(
          Math.max(dp_max[i - 1] * A[i], dp_min[i - 1] * A[i]), A[i]);
      max = Math.max(dp_max[i], max);
    }
    return max;
  }
  }
