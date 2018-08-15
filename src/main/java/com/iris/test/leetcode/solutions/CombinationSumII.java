package com.iris.test.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
  public static void main(String[] args) {
    int[] candidates = {10,1,2,7,6,1,5};
    int target = 8;
    List<List<Integer>> res = combinationSum2(candidates, target);
    System.out.println(res);
  }

  public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(candidates);
    dfs(candidates, result, new ArrayList<>(), target, 0);

    return result;
  }

  private static void dfs(int[] candidates, List<List<Integer>> result, List<Integer> temp, int target, int idx) {
    if(target == 0) {
      List<Integer> subResult = new ArrayList<>(temp);
      result.add(subResult);
      return;
    }
    else if(target < 0) {
      return;
    }
    else {
      for(int i = idx; i < candidates.length; i++) {
        if(i > idx && candidates[i] == candidates[i - 1]) continue;
        temp.add(candidates[i]);
        dfs(candidates, result, temp, target - candidates[i], i+1);
        temp.remove(temp.size()-1);
      }
    }
  }
}
