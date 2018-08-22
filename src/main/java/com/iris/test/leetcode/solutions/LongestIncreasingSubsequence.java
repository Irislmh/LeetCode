package com.iris.test.leetcode.solutions;

/**
Given an unsorted array of integers, find the length of longest increasing subsequence.

Example:

Input: [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
Note:

There may be more than one LIS combination, it is only necessary for you to return the length.
Your algorithm should run in O(n2) complexity.
Follow up: Could you improve it to O(n log n) time complexity?

Programming的解法，这种解法的时间复杂度为O(n2)，我们维护一个一维dp数组，
其中dp[i]表示以nums[i]为结尾的最长递增子串的长度，
对于每一个nums[i]，我们从第一个数再搜索到i，
如果发现某个数小于nums[i]，我们更新dp[i]，更新方法为dp[i] = max(dp[i], dp[j] + 1)，
即比较当前dp[i]的值和那个小于num[i]的数的dp值加1的大小，
我们就这样不断的更新dp数组，到最后dp数组中最大的值就是我们要返回的LIS的长度
 */

import java.util.Arrays;

public class LongestIncreasingSubsequence {

  public static void main(String[] args) {
    int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
    System.out.println(lengthOfLIS(nums));
  }

  public static int lengthOfLIS(int[] nums) {
    if (nums.length == 0) return 0;
    if (nums.length == 1) return 1;

    int[] dp = new int[nums.length + 1];
    Arrays.fill(dp, 1);

    int result = 1;

    for(int i = 0; i < nums.length; i++) {
      for(int j = 0; j < i; j++) {
        if(nums[j] < nums[i]) {
          dp[i] = Math.max(dp[j] + 1, dp[i]);
        }
      }
      result = Math.max(dp[i], result);
    }
    return result;
  }
}
