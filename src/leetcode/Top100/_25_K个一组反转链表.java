package leetcode.Top100;

/**
 * @ClassName _25_K个一组反转链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/11/15 10:13
 */
public class _25_K个一组反转链表 {
    /**
     * K个一组反转链表
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode end = dummy;
        while (end.next != null) {
            for (int i = 0; i < k; i++) {
                end = end.next;
            }
            if (end == null) {
                break;
            }
            ListNode start = pre.next;
            ListNode next = end.next;
            end.next = null;
            pre.next = reverse(start);
            start.next = next;
            pre = start;
            end = pre;
        }

        return dummy.next;
    }

    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        //ListNode curr = head;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}