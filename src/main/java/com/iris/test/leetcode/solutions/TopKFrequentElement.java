package com.iris.test.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElement {

  public static void main(String[] args) {
    int [] nums = {1,1,1,2,2,3};
    int k = 2;
    System.out.println(topKFrequent(nums, k));
  }

  public static List<Integer> topKFrequent(int[] nums, int k) {
    List<Integer> list = new ArrayList<>();
    if(nums.length == 0) {
      return list;
    }

    Map<Integer, Integer> map = new HashMap<>();

    Arrays.sort(nums);
    for(Integer num : nums) {
      if(!map.containsKey(num)) {
        map.put(num, 1);
      }
      else {
        map.put(num, map.get(num) + 1);
      }
    }

    List<Integer> [] array = new ArrayList[nums.length + 1];
    for(Integer number : map.keySet()) {
      int index = map.get(number);
      if(array[index] == null) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(number);
        array[index] = numbers;
      }else {
        array[index].add(number);
      }
    }

    List<Integer> result = new ArrayList<>();

    for(int i = array.length -1; i > -1; i--) {
      if(array[i] != null) {
        for(Integer num : array[i]){
          if(result.size() < k) {
            result.add(num);
          }
        }
      }
    }
    return result;
  }
}
