package com.iris.test.leetcode.solutions;

public class AddTwoNumbers {
  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if(l1 == null) {
      return l2;
    }
    if(l2 == null) {
      return l1;
    }
    if(l1 == null && l2 == null) {
      return null;
    }
    ListNode newNode = new ListNode(0);
    ListNode head = newNode;
    int carry = 0;

    while(l1 != null && l2 != null) {
      int sum = l1.val + l2.val + carry;
      newNode.next = new ListNode(sum % 10);
      newNode = newNode.next;
      carry = sum/10;
      l1 = l1.next;
      l2 = l2.next;
    }

    while(l1 != null) {
      int sum = l1.val + carry;
      newNode.next = new ListNode(sum % 10);
      newNode = newNode.next;
      carry = sum/10;
      l1 = l1.next;
    }

    while(l2 != null) {
      int sum = l2.val + carry;
      newNode.next = new ListNode(sum % 10);
      newNode = newNode.next;
      carry = sum/10;
      l2= l2.next;
    }

    if(carry != 0) {
      newNode.next = new ListNode(carry);
    }

    return head.next;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(2);
    ListNode l2 = new ListNode(4);
    l1.next = new ListNode(8);
    l2.next = new ListNode(7);

    ListNode result = addTwoNumbers(l1, l2);
    while(result != null) {
      System.out.print(result.val + "\t");
      result = result.next;
    }

  }
}
