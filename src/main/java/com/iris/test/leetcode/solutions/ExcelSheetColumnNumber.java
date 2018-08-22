package com.iris.test.leetcode.solutions;

/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * For example:
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * Example 1:
 *
 * Input: "A"
 * Output: 1
 * Example 2:
 *
 * Input: "AB"
 * Output: 28
 * Example 3:
 *
 * Input: "ZY"
 * Output: 701
 */
public class ExcelSheetColumnNumber {
  static String full = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  public static void main(String[] args) {
    String s = "AB";
    System.out.println(titleToNumber(s));
  }

  public static int titleToNumber(String s) {
    if(s == null || s.isEmpty()) {
      return 0;
    }
    int sum = 0;
    for(int i = 0; i < s.length(); i++) {
      sum += (full.indexOf(s.charAt(i)) + 1) * Math.round(Math.pow(26, s.length() - i - 1));
    }
    return sum;
  }
}