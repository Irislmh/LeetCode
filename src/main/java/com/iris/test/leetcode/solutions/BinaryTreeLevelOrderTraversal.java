package com.iris.test.leetcode.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    TreeNode right = new TreeNode(20);
    right.left = new TreeNode(15);
    right.right = new TreeNode(7);
    root.right = right;
    System.out.println(levelOrder(root));
  }

  public static List<List<Integer>> levelOrder(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    List<List<Integer>> wrapList = new ArrayList<>();

    if(root == null) return wrapList;

    queue.add(root);
    while(!queue.isEmpty()){
      int levelNum = queue.size();
      List<Integer> subList = new LinkedList<>();
      for(int i=0; i<levelNum; i++) {
        if(queue.peek().left != null) queue.offer(queue.peek().left);
        if(queue.peek().right != null) queue.offer(queue.peek().right);
        subList.add(queue.poll().val);
      }
      wrapList.add(subList);
    }
    return wrapList;
  }
}
