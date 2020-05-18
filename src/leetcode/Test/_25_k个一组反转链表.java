package leetcode.Test;


/**
 * @ClassName _25_k个一组反转链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/16 9:26
 */
public class _25_k个一组反转链表 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head==null) return null;
        //临界值判断
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        ///***************注意这里是dummy.next = head;而不是pre.next= head**********************
        dummy.next = head;
        //第二点
        ListNode end = pre;
        //ListNode end = dummy;
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
            //start.next = pLast;
            pre = start;
            //第一点
            end = pre;
            //end = start;
            start.next = pLast;
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
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        ListNode a = reverseKGroup(node1, 3);
        while (a != null) {
            System.out.print(a.val);
            System.out.print("->");
            a=a.next;
        }
    }
}