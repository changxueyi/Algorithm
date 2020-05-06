package 剑指offer.链表;

/**
 * @ClassName _24_反转链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/3 9:53
 */
public class _24_反转链表 {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
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
        ListNode a = reverseList(node1);
        while (a!= null) {
            System.out.print(a.val);
            System.out.print("->");
            a =a.next;
        }
    }


}