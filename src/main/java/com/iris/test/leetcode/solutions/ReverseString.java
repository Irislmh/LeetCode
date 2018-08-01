package com.iris.test.leetcode.solutions;

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
