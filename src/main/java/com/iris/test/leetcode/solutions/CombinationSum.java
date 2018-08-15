package com.iris.test.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

  public static void main(String[] args) {
    int[] candidates = {2,3,6,7};
    int target = 7;
    List<List<Integer>> res = combinationSum(candidates, target);
    System.out.println(res);
  }

  public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(candidates);
    dfs(candidates, res, new ArrayList<>(), target, 0);
    return res;
  }

  public static void dfs(int[] candidates, List<List<Integer>> res, List<Integer> temp, int target, int idx) {
    if(target == 0) {
      List<Integer> subResult = new ArrayList<>(temp);
      res.add(subResult);
    }
    else if(target < 0) {
      return;
    }
    else {
      for(int i = idx; i < candidates.length; i++) {
        temp.add(candidates[i]);
        dfs(candidates, res, temp, target - candidates[i], i);
        temp.remove(temp.size()-1);
      }
    }
  }
}
