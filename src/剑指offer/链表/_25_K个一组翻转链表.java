package 剑指offer.链表;

/**
 * @ClassName _25__K个一组翻转链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/7 18:07
 */
public class _25_K个一组翻转链表 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode end = dummy;
        while (end != null) {
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            //只要end遍历到了null直接跳出循环
            if (end == null) {
                break;
            }
            //定义pLast 指向反转链表元素后面的第一个元素
            ListNode pLast = end.next;
            ListNode start = pre.next;
            end.next = null;
            pre.next = reverse(start);

            start.next = pLast;
            pre = start;
            end = pre;
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode p = cur.next;
            cur.next = pre;
            pre = cur;
            cur = p;
        }
        return pre;
    }
}