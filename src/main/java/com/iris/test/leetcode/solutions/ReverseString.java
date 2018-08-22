package com.iris.test.leetcode.solutions;

/**
 * Write a function that takes a string as input and returns the string reversed.
 *
 * Example 1:
 *
 * Input: "hello"
 * Output: "olleh"
 * Example 2:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: "amanaP :lanac a ,nalp a ,nam A"
 */
public class ReverseString {
  public String reverseString(String s) {
    char [] array = s.toCharArray();
    StringBuilder sb = new StringBuilder();
    for(int i = array.length - 1; i >= 0; i--) {
      sb.append(array[i]);
    }
    return sb.toString();
  }
}
