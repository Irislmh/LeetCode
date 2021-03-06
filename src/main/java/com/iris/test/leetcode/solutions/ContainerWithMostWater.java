package com.iris.test.leetcode.solutions;

/**
 * Created by mengli on 12/4/19.
 */


/**Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

 Note: You may not slant the container and n is at least 2.
 The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 Example:
 Input: [1,8,6,2,5,4,8,3,7]
 Output: 49
 **/

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = maxArea(height);
        System.out.println(maxArea);
    }

    public static int maxArea(int[] height) {
        int l = 0; int r = height.length - 1; int maxArea = 0;

        while(l < r) {
            if(height[r] < height[l]) {
                maxArea = Math.max(maxArea, height[r] * (r - l));
                r--;
            }
            else {
                maxArea = Math.max(maxArea, height[l] * (r - l));
                l++;
            }
        }
        return maxArea;
    }


}
