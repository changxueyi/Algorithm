package 剑指offer.链表;

/**
 * @ClassName lc_83_链表中重复元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/2 10:57
 */
public class lc_83_链表中重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }


}