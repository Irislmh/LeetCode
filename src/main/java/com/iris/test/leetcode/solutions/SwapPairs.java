package com.iris.test.leetcode.solutions;

import java.util.Stack;

/**
 * Created by mengli on 12/6/19.
 */

/**
 * Given a linked list, swap every two adjacent nodes and return its head.

 You may not modify the values in the list's nodes, only nodes itself may be changed.



 Example:

 Given 1->2->3->4, you should return the list as 2->1->4->3.
 */
public class SwapPairs {

    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }
        ListNode p = new ListNode(-1);
        ListNode cur = head;
        head = p;

        Stack<ListNode> stack = new Stack<>();

        while(cur != null && cur.next != null) {
            stack.push(cur);
            stack.push(cur.next);
            cur = cur.next.next;

            p.next = stack.pop();
            p = p.next;
            p.next = stack.pop();
            p = p.next;
        }

        if(cur != null) {
            p.next = cur;
        }else {
            p.next = null;
        }
        return head.next;
    }


    public ListNode swapPairs1(ListNode head) {
        //递归的终止条件
        if(head==null || head.next==null) {
            return head;
        }
        //假设链表是 1->2->3->4
        //这句就先保存节点2
        ListNode tmp = head.next;
        //继续递归，处理节点3->4
        //当递归结束返回后，就变成了4->3
        //于是head节点就指向了4，变成1->4->3
        head.next = swapPairs(tmp.next);
        //将2节点指向1
        tmp.next = head;
        return tmp;
    }
}

