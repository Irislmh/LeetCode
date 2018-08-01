package com.iris.test.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

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
