package com.iris.test.leetcode.solutions;

public class MaximumSubarray {

  public static void main(String[] args) {
    int[] nums = {-2,0};
    System.out.println(maxSubArray(nums));
  }

  public static int maxSubArray(int[] nums) {
    int max = nums[0];
    int[] dp_max = new int[nums.length];

    dp_max[0] = nums[0];

    for(int i = 1; i < nums.length; ++i) {
      dp_max[i] = Math.max(dp_max[i - 1] + nums[i], nums[i]);
      max = Math.max(dp_max[i], max);
    }
    return max;
  }
}
