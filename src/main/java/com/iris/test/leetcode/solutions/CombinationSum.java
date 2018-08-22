package com.iris.test.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
 *
 * The same repeated number may be chosen from candidates unlimited number of times.
 *
 * Note:
 *
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * Example 1:
 *
 * Input: candidates = [2,3,6,7], target = 7,
 * A solution set is:
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * Example 2:
 *
 * Input: candidates = [2,3,5], target = 8,
 * A solution set is:
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 */
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
