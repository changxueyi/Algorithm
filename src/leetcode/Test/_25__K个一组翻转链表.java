package leetcode.Test;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

/**
 * @ClassName _25__K个一组翻转链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/23 15:28
 */
public class _25__K个一组翻转链表 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 0) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode end = dummy;
        while (end != null) {
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if (end == null) {
                break;
            }
            ListNode start = pre.next;
            ListNode pLast = end.next;
            end.next = null;
            pre.next = reverse(start);
            start.next = pLast;
            pre =  start;
            end =  start;

        }
        return dummy.next;

    }

    private static ListNode reverse(ListNode node) {
        ListNode pre = null;
        ListNode cur = node;
        while (cur != null) {
            ListNode a = cur.next;
            cur.next = pre;
            pre = cur;

            cur = a;
        }
        return pre;
    }
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
        ListNode a = reverseKGroup(node1,3);
        while (a!=null){
            System.out.print(a.val);
            System.out.print("->");
            a = a.next;
        }
    }
}