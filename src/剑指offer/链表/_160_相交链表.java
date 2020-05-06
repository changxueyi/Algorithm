package 剑指offer.链表;

/**
 * @ClassName _160_相交链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/3 22:02
 */
public class _160_相交链表 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            if (a != null) {
                a = a.next;
            } else {
                a = headB;
            }
            if (b != null) {
                b = b.next;
            } else {
                b = headA;
            }
        }

            return a;

    }

    public static void main(String[] args) {
        // 1 3 6 9
        // 5 6 9
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode node10 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(9);
        node10.next = node5;
        node5.next = node6;

        ListNode cur = getIntersectionNode(node1, node10);
        System.out.println(cur.val);

    }

}