package 剑指offer.链表;

/**
 * @ClassName _21_合并两个有序链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/3 21:36
 */
public class _21_合并两个有序链表 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode c = dummy;
        ListNode a = l1;
        ListNode b = l2;

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

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(9);

        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(11);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        node5.next = node6;
        node6.next = node7;

        ListNode cur = mergeTwoLists(node1, node5);
        while (cur != null) {
            System.out.print(cur.val);
            System.out.print("->");
            cur = cur.next;
        }

    }
}