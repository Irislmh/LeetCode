package com.iris.test.leetcode.solutions;

/**
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
public class MoveZeroes {
  public static void main(String[] args) {
    int [] nums = {5,0,0,1,4,0,2,0};
    moveZeroes(nums);
    for(int num : nums) {
      System.out.print(num + " ");
    }
  }
  public static void moveZeroes(int[] nums) {
    for(int i = 0; i < nums.length; i++) {
       for(int j = i+1; j < nums.length; j++) {
         if(nums[i] == 0 && nums[j] != 0) {
           int temp;
           temp = nums[i];
           nums[i] = nums[j];
           nums[j] = temp;
           break;
         }
       }
      }
    }
}
