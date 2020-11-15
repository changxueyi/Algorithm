package leetcode.链表;

/**
 * @ClassName _24_两两交换链表中的节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/22 14:25
 */
public class _24_两两交换链表中的节点 {
    public static ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        while (pre.next != null && pre.next.next != null) {
            ListNode start = pre.next;
            ListNode end = pre.next.next;
            start.next = end.next;
            end.next = start;
            pre.next = end;

            pre = start;
        }
        return dummy.next;
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
        ListNode node = swapPairs(node1);
        while (node != null) {
            System.out.print(node.val);
            System.out.print("->");
            node = node.next;
        }
    }
}