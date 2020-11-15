package leetcode.Test;

/**
 * @ClassName _203_移除链表元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/24 8:56
 */
public class _203_移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        while (pre != null&&pre.next!=null) {
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }
        return dummy.next;
    }
}