package com.iris.test.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
  public List<String> fizzBuzz(int n) {
    List<String> result = new ArrayList<>();
    if(n <= 0) {
      return result;
    }
    else {
      for(int i = 1; i <=n; i++) {
        if(i%3==0 && i%5==0) {
          result.add("FizzBuzz");
        }
        else if(i%3==0 && i%5 != 0) {
          result.add("Fizz");
        }
        else if(i%3 != 0 && i%5 == 0) {
          result.add("Buzz");
        }
        else {
          result.add(String.valueOf(i));
        }
      }
    }
    return result;
  }
}
