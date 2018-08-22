package com.iris.test.leetcode.solutions;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 *
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
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
