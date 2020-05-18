package 剑指offer.链表;

/**
 * @ClassName _9_链表中环的入口结点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/2 9:24
 */
public class _9_链表中环的入口结点 {
    public static ListNode detectCycle(ListNode head) {
        //  if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast.val == slow.val)
                break;
        }
        if (fast == null || fast.next == null) return null;//说明没有环
        //有环
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        //    ListNode node5 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1;
        ListNode resutl = detectCycle(node1);
        System.out.println(resutl.val);
    }
}