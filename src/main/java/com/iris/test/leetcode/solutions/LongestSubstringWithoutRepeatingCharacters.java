package com.iris.test.leetcode.solutions;

/**
 * Created by mengli on 9/5/19.
 */


/**
 * Given a string, find the length of the longest substring without repeating characters.

 Example 1:

 Input: "abcabcbb"
 Output: 3
 Explanation: The answer is "abc", with the length of 3.
 Example 2:

 Input: "bbbbb"
 Output: 1
 Explanation: The answer is "b", with the length of 1.
 Example 3:

 Input: "pwwkew"
 Output: 3
 Explanation: The answer is "wke", with the length of 3.
 Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aabaab!bb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty()) {
            return 0;
        }
        int length = 0;
        int dupliateIndex = -1;
        int maxLength = -1;
        String scanned = "";
        for(char c : s.toCharArray() ) {
            if(scanned.indexOf(c) == -1) {
                scanned += Character.toString(c);
                length ++;
                maxLength = length > maxLength ? length : maxLength;
            }else {
                dupliateIndex = scanned.indexOf(Character.toString(c));
                scanned = scanned.substring(dupliateIndex);
                length = scanned.length();
            }
        }
        return maxLength;
    }
}
