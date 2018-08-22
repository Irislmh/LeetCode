package com.iris.test.leetcode.solutions;

/**
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
 */
public class MaximumDepthofBinaryTree {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    TreeNode left = new TreeNode(2);
    TreeNode left1 = new TreeNode(1);
    TreeNode right = new TreeNode(5);
    TreeNode right1 = new TreeNode(4);
    root.left = left;
    left.left = left1;
    left.right = right1;
    right1.right = right;

    System.out.println(maxDepth(root));

  }

  public static int maxDepth(TreeNode root) {
    if(root == null) {
      return 0;
    }
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    return Math.max(left, right) + 1;
  }

}
