package leetcode.Test;

/**
 * @ClassName _83_删除排序链表中的重复元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/23 16:07
 */
public class _83_删除排序链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode cur = head;
        while (cur.next != null && cur.next.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return cur;
    }
}