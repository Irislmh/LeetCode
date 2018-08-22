package com.iris.test.leetcode.solutions;

/**
 * Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
 *
 * Example 1:
 *
 * Input: [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 * Example 2:
 *
 * Input: [-2,0,-1]
 * Output: 0
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */
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
