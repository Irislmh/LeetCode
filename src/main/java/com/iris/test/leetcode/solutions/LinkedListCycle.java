package com.iris.test.leetcode.solutions;

/**
 * Created by mengli on 12/9/19.
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        if(head == null || head.next == null) {
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}
