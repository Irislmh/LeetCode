package com.iris.test.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Note:
 *
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 *
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class IntersectionOfTwoArraysII {
  public int[] intersect(int[] nums1, int[] nums2) {
    List<Integer> numsList1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
    List<Integer> numsList2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
    List<Integer> result = new ArrayList<Integer>();

    Collections.sort(numsList1);
    Collections.sort(numsList2);

    int i = 0;
    int j = 0;
    while(i < numsList1.size() && j < numsList2.size()) {
      if (numsList1.get(i).intValue() < numsList2.get(j).intValue()) {
        i++;
      }
      else if (numsList1.get(i).intValue() == numsList2.get(j).intValue()) {
        result.add(numsList1.get(i));
        i++;
        j++;
      }
      else if (numsList1.get(i).intValue() > numsList2.get(j).intValue()) {
        j++;
      }
    }
    return result.stream().mapToInt(n -> n).toArray();
  }
}
