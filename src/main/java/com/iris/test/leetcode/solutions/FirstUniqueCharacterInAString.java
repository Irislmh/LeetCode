package com.iris.test.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 *
 * Examples:
 *
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 */
public class FirstUniqueCharacterInAString {

  public int firstUniqChar(String s) {
    List<Character> list = new ArrayList<>();
    for(int i = 0; i < s.length(); i++) {
      if(s.lastIndexOf(s.charAt(i)) == i && !list.contains(s.charAt(i))) {
        return i;
      }
      list.add(s.charAt(i));
    }
    return -1;
  }
}
