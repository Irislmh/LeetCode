package com.iris.test.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 *
 * Note:
 *
 * The solution set must not contain duplicate triplets.
 *
 * Example:
 *
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */
public class ThreeSum {
  List<List<Integer>> ret = new ArrayList<List<Integer>>();

  public List<List<Integer>> threeSum(int[] num) {
    if (num == null || num.length < 3) return ret;

    Arrays.sort(num);

    int len = num.length;
    for (int i = 0; i < len-2; i++) {
      if (i > 0 && num[i] == num[i-1]) continue;
      find(num, i+1, len-1, num[i]);
    }

    return ret;
  }

  public void find(int[] num, int begin, int end, int target) {
    int l = begin, r = end;
    while (l < r) {
      if (num[l] + num[r] + target == 0) {
        List<Integer> ans = new ArrayList<Integer>();
        ans.add(target);
        ans.add(num[l]);
        ans.add(num[r]);
        ret.add(ans);
        while (l < r && num[l] == num[l+1]) l++;
        while (l < r && num[r] == num[r-1]) r--;
        l++;
        r--;
      } else if (num[l] + num[r] + target < 0) {
        l++;
      } else {
        r--;
      }
    }
  }
}
