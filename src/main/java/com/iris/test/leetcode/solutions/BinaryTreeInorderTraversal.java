package com.iris.test.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;


/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * Example:
 *
 * Input: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * Output: [1,3,2]
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreeInorderTraversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = null;
    TreeNode node = new TreeNode(2);
    root.right = node;
    node.left = new TreeNode(3);
    System.out.println(inorderTraversal(root));
  }
  private static List<Integer> list = new ArrayList<>();

  public static List<Integer> inorderTraversal(TreeNode root) {

    if(root == null) {return list;}
    if(root.left != null) {
      inorderTraversal(root.left);
    }
    list.add(root.val);
    if(root.right != null) {
      inorderTraversal(root.right);
    }

    return list;
  }

}
