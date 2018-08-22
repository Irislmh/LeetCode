package com.iris.test.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    int [] division = new int[nums.length];
    Map<Integer, Integer> divisionMap = new HashMap<>();
    List<Integer> numsList =  Arrays.stream(nums).boxed().collect(Collectors.toList());
    List<Integer> result = new ArrayList<>();
    for(int i=0; i< nums.length; i++) {
      division[i] = target - nums[i];
    }
    for(int i = 0; i < division.length; i++) {
      if(divisionMap.keySet().contains(division[i])) {
        int newValue = divisionMap.get(division[i]) + 1;
        divisionMap.put(division[i], newValue);
      }else {
        divisionMap.put(division[i], 1);
      }
    }
    for(int i=0; i<division.length; i++) {
      if(numsList.contains(division[i])) {
        if(division[i] * 2 != target) {
          result.add(i);
        }
        else {
          if(divisionMap.get(division[i]) > 1) {
            result.add(i);
          }
        }
      }
      if(result.size() == 2) {
        break;
      }
    }
    int[] index = result.stream().mapToInt(i->i).toArray();
    return index;
  }
}
