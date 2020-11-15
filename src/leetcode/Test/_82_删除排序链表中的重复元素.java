package leetcode.Test;

/**
 * @ClassName _82_删除排序链表中的重复元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/23 16:17
 */
public class _82_删除排序链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        while (pre.next != null&&pre.next.next!=null) {
            if (pre.next.val == pre.next.next.val) {
                ListNode temp = pre.next;
                while (temp != null && temp.next != null && temp.val == temp.next.next.val) {
                    temp = temp.next;
                }
                pre = pre.next;
            } else {
                pre = pre.next;
            }
        }
        return pre.next;
    }
}