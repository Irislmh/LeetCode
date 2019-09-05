package com.iris.test.leetcode.solutions;

/**
 * Created by mengli on 9/6/18.
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
    }

    public ListNode reverseList(ListNode head) {
        while(head.next != null) {
            head.next.next = head;
            reverseList(head.next);
            head.next = null;
        }
    }
}
