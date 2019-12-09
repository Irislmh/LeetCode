package com.iris.test.leetcode.solutions;

/**
 * Created by mengli on 12/6/19.
 */
public class ReverseNodesinKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) {
            return null;
        }

       int count = k-1;
        ListNode start = head;
        ListNode stop = head;
        while(stop.next != null && count > 0) {
            stop = stop.next;
            count--;
        }

        if(count > 0) {
            return head;
        }

        ListNode next = stop.next;
        head = reverse(start, stop);

        reverseKGroup(next, k);
        return head;
    }

    public ListNode reverse(ListNode start, ListNode stop) {
        ListNode pre = null;
        ListNode cur = start;
        stop = stop.next;

       while(cur != stop) {
           ListNode temp = cur.next;
           cur.next = pre;
           pre = cur;
           cur = temp;
       }

       return pre;
    }
}
