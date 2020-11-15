package leetcode.Test;

/**
 * @ClassName _876_链表的中间结点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/24 9:26
 */
public class _876_链表的中间结点 {
    public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next;
            cur = cur.next;
        }
        return cur;
    }

}