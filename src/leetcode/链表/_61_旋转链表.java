package leetcode.链表;

import static 剑指offer.链表._24_两两交换链表中的节点.swapPairs;

/**
 * @ClassName _61_旋转链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/16 22:05
 */
public class _61_旋转链表 {
    public static ListNode fun(ListNode head, int k) {
        if (head == null || k <= 0) {
            return head;
        }
        ListNode p = new ListNode(-1);
        p.next = head;
        ListNode cur = p;
        ListNode low = p;
        ListNode fast = p;
        //统计链表个数
        int n = 0;
        while (cur.next != null) {
            cur = cur.next;
            ++n;
        }
        if (n == 0 || k % n == 0) {
            return head;
        }
        //注意判断下到底走多远才可以
        n = k % n;
        while (fast.next != null && n > 0) {
            fast = fast.next;
            --n;
        }
        while (fast.next != null) {
            low = low.next;
            fast = fast.next;
        }
        fast.next = p.next;
        //设置头节点
        p.next = low.next;
        low.next = null;
        return p.next;
    }


    //14点10分


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode a = fun(node1, 2);
        while (a != null) {
            System.out.print(a.val);
            System.out.print("->");
            a = a.next;
        }
    }
}