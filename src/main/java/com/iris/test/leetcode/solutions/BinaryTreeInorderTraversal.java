package com.iris.test.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

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
