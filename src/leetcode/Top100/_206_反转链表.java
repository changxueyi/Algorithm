package leetcode.Top100;

import com.sun.scenario.effect.impl.prism.PrReflectionPeer;

/**
 * @ClassName _206_反转链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/20 17:40
 */
public class _206_反转链表 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    //非递归实现反转链表
    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newNode = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = newNode;
            newNode = head;
            head = tmp;
        }
        return newNode;
    }

    //自己再来实现一遍反转链表
    public ListNode reveresList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = newHead;
            newHead = head;
            head = tmp;
        }
        return newHead;
    }


    /**
     * 反转链表 ： 09点46分
     */
    public ListNode reversList(ListNode head) {
        //递归实现
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    /**
     * 非递归实现
     */
    public ListNode reversList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        /**
         * 这个位置的地方，不能把newHead进行赋值，不然的话，就无法进行反转，反转后，还要把这个尾巴去了
         */
        ListNode newHead = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = newHead;
            newHead = head;
            head = tmp;
        }
        return newHead;
    }
}