package leetcode.Test;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

/**
 * @ClassName _24_两两交换链表中的节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/23 15:01
 */
public class _24_两两交换链表中的节点 {
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        while (pre.next != null && pre.next.next != null) {
            ListNode start = pre.next;
            ListNode end = pre.next.next;
            pre.next = end;

            start.next = end.next;
            end.next = start;
           // pre.next = end;

            pre = start;
        }
        return dummy.next;
    }
}