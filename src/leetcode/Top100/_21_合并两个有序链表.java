package leetcode.Top100;

import java.util.List;

/**
 * @ClassName _21_合并两个有序链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/20 18:13
 */
public class _21_合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;
        ListNode dummy = new ListNode(-1);
        ListNode c = dummy;
        while (a != null && b != null) {
            if (a.val > b.val) {
                c.next = b;
                b = b.next;
            } else {
                c.next = a;
                a = a.next;
            }
            c = c.next;
        }
        if (a == null) {
            c.next = b;
        } else {
            c.next = a;
        }
        return dummy.next;
    }

}