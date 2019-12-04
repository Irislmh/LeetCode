package com.iris.test.leetcode.solutions;

/**
 * Created by mengli on 12/4/19.
 */

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

 Note:

 The number of elements initialized in nums1 and nums2 are m and n respectively.
 You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 Example:

 Input:
 nums1 = [1,2,3,0,0,0], m = 3
 nums2 = [2,5,6],       n = 3

 Output: [1,2,2,3,5,6]
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        merge(nums1, 1, nums2, 1);

        for(int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + ",");
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0) {
          for(int i =0; i < nums2.length; i++) {
              nums1[i] = nums2[i];
          }
          return;
        }

        if(n == 0) {
            return;
        }

        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        while (p >= 0 && p1>=0 && p2>=0) {
           if(nums1[p1] > nums2[p2]) {
               nums1[p] = nums1[p1];
               p1--;
           }
           else {
               nums1[p] = nums2[p2];
               p2--;
           }
           p--;
        }

        if(p2 < 0) {
            return;
        }

        while(p2 >= 0){
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
