package 剑指offer.Test;

/**
 * @ClassName _25_K个一组反转
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/8 9:45
 */
public class _25_K个一组反转 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;
        ListNode dummy = new ListNode(0);
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
            ListNode lpast = end.next;
            end.next = null;
            pre.next = reverse(start);

            start.next = lpast;

            pre = start;
            end = start;
        }
        return dummy.next;
    }

    private static ListNode reverse(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;

            cur = temp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        ListNode a = reverseKGroup(node1, 3);
        while (a != null) {
            System.out.print(a.val);
            System.out.print("->");
            a = a.next;
        }
    }
}