package com.iris.test.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfTwoArraysII {
  public int[] intersect(int[] nums1, int[] nums2) {
    List<Integer> numsList1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
    List<Integer> numsList2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
    List<Integer> result = new ArrayList<>();

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
